import tkinter as tk
from tkinter import messagebox

def login():
    # Pre-defined username and password (for demonstration purposes)
    valid_username = "user123"
    valid_password = "password123"

    # Retrieve user input
    entered_username = username_entry.get()
    entered_password = password_entry.get()

    if entered_username == valid_username and entered_password == valid_password:
        messagebox.showinfo("Login Successful", "Welcome, " + entered_username + "!")
    else:
        messagebox.showerror("Login Failed", "Invalid username or password")

# Create the main window
root = tk.Tk()
root.title("Login Page")

# Customer ID (Label and Entry)
customer_id_label = tk.Label(root, text="Customer ID:")
customer_id_label.pack()
customer_id_entry = tk.Entry(root)
customer_id_entry.pack()

# Customer Name (Label and Entry)
customer_name_label = tk.Label(root, text="Customer Name:")
customer_name_label.pack()
customer_name_entry = tk.Entry(root)
customer_name_entry.pack()

# Login Button
login_button = tk.Button(root, text="Login", command=login)
login_button.pack()

# Reset Button (clears entries)
def reset():
    customer_id_entry.delete(0, tk.END)
    customer_name_entry.delete(0, tk.END)

reset_button = tk.Button(root, text="Reset", command=reset)
reset_button.pack()

# Sign Up Button (opens sign-up page)
def sign_up():
    # Implement sign-up logic here
    pass

sign_up_button = tk.Button(root, text="Sign Up", command=sign_up)
sign_up_button.pack()

root.mainloop()
