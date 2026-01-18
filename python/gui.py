import mysql.connector
from tkinter.ttk import *
from tkinter import *
from tkinter import messagebox
mydb = mysql.connector.connect(host = "localhost", user = "root",password = "",database = "collage")
if mydb:
	print("Connected ")
else:
	print("Not Connected")
cur = mydb.cursor()
'''cur.execute("select * from student")
result = cur.fetchall()
print("ID   Name     Sem      City")
for i in result:
	print("%d    %s     %d       %s"%(i[0],i[1],i[2],i[3]))'''

root = Tk()
root.title("Student Data")
root.geometry("500x200")
label1 = Label(root,text = "ID").grid(row = 0,column = 0)
label2 = Label(root,text = "Name").grid(row = 1,column = 0)
label3 = Label(root,text = "Semester").grid(row = 2,column = 0)
label4 = Label(root,text = "City").grid(row = 3,column = 0)


e1 = Entry(root,width = 30)
e1.grid(row = 0,column = 1)
e2 = Entry(root,width = 30)
e2.grid(row = 1,column = 1)
e3 = Entry(root,width = 30)
e3.grid(row = 2,column = 1)
e4 = Entry(root,width = 30)
e4.grid(row = 3,column = 1)
def Register():
	
	insert = "insert into student(id,name,sem,city)values(%s,%s,%s,%s)"
	id=e1.get()
	name = e2.get()
	sem = e3.get()
	city = e4.get()
	if(id != "" and name != "" and sem != "" and city != ""):
		value = (id,name,sem,city)
		cur.execute(insert,value)
		mydb.commit()
		messagebox.askokcancel("Information","Record inserted")
		e1.delete(0,END)
		e2.delete(0,END)
		e3.delete(0,END)
		e4.delete(0,END)
	else:
		if(id == "" and name == "" and sem == "" and city == ""):
			messagebox.askokcancel("Information","Fill All details")
		else:
			messagebox.askokcancel("Information","Some Field Blank")
def clear():
	e1.delete(0,END)
	e2.delete(0,END)
	e3.delete(0,END)
	e4.delete(0,END)

button1 = Button(root,text = "Register",command = Register).grid(row = 4,column = 1)
button2 = Button(root,text = "Clear",command = clear).grid(row = 4,column = 0)
root.mainloop()