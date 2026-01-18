code = int(input("Enter the code of the employee = "))
name = input("Enter the name of the employee = ")
city = input("Enter the city of the employee = ")
bs = int(input("Enter the basic salary of the employee per month = "))
da = 0.82*bs
hra = 0.45*bs
ma = 0.12*bs
gs = da+hra+ma+bs
ys = gs*12
print("Gross salary monthly = ",gs)
print("Yearly gross salary = ",ys)
if 250000>=ys :
	print("Yearly gross salary = ",ys)
elif ys>=250001 and ys<=500000:
	net = 0.05*(ys - 250000)
elif ys>=500001 and ys<=1000000:
	net = 12500+0.2*(ys - 500000)
else:
	net = 112500+0.3*(ys - 1000000)
print("income tax return = ",net)