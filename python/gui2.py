from tkinter.ttk import *
from tkinter import *
import mysql.connector
from tkinter import messagebox
mydb = mysql.connector.connect(host="localhost",user="root",password="",database="collage")
if mydb:
    print("Connected")
else:
    print("Not Connected")
mycursor = mydb.cursor()
root = Tk()
root.title("Student Data")
root.geometry("500x200")
label1 = Label(root, text="RollNo", width=20, height=2,bg="pink").grid(row=0, column=0)
label2 = Label(root, text="Name", width=20,height=2, bg="pink").grid(row=1, column=0)
label3 = Label(root, text="Sem", width=20, height=2,bg="pink").grid(row=2, column=0)
label4 = Label(root, text="City", width=20, height=2,bg="pink").grid(row=3, column=0)

e1 = Entry(root, width=30, borderwidth=8)
e1.grid(row=0, column=1)
e2 = Entry(root, width=30, borderwidth=8)
e2.grid(row=1, column=1)
e3 = Entry(root, width=30, borderwidth=8)
e3.grid(row=2, column=1)
e4 = Entry(root, width=30, borderwidth=8)
e4.grid(row=3, column=1)

def Register():

    Insert = "Insert into student(id,name,sem,city) values(%s,%s,%s,%s)"
    Id = e1.get()
    Name = e2.get()
    Sem = e3.get()
    City = e4.get()
    if(Id!= "" and Name!="" and Sem!="" and City != ""):
        Value = (Id,Name,Sem,City)
        mycursor.execute(Insert, Value)
        mydb.commit()
        messagebox.askokcancel("Information", "Record inserted")
        e1.delete(0, END)
        e2.delete(0, END)
        e3.delete(0, END)
        e4.delete(0, END)
    else:
        if (Id == "" and Name == "" and Sem == "" and City == "" ):
            messagebox.askokcancel("Information", "New Entery Fill All Details")
        else:
            messagebox.askokcancel("Information", "Some fields left blank")
def Clear():
    e1.delete(0, END)
    e2.delete(0, END)
    e3.delete(0, END)
    e4.delete(0, END)
button1 = Button(root, text="Register", width=10, height=2,command=Register).grid(row=7, column=0)
button2 = Button(root, text="Clear", width=10, height=2,command=Clear).grid(row=7, column=1)
root.mainloop()