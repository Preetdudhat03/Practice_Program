class SalaryNotInRangeError(Exception):
	pass	
salary = int(input("Enter the Salary = "))
try:
	if not 5000 < salary<15000:
		raise SalaryNotInRangeError
except SalaryNotInRangeError:
	print("Salary is not in (5000,15000)range")
else:
	print("Salary is in range")
