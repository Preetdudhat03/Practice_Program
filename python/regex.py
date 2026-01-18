import re
email = input("Enter the Email for google = ")
nm = re.compile(r'([a-zA-Z0-9\.\_]+)(@+)(gmail+)(\.com+)')
match = nm.finditer(email)
for m in match:
	print(m.group(0))
	if match != m.group(0):
		print("your Email is currect")
		print()
#if match:
	else:
		print("your Email is incurrect, retry!!!")

num = input("Enter your password for Email = ")
n = re.compile(r'[A-Z]+[a-z]+[0-9]+[!@#$%^&*(_+=*-`~,.?;:''""{})[]|\\]')
number = n.finditer(num)
for pas in number:
	if pas.group(0):
		print("Your password is strong")
	else:
		print("your password is weak")	