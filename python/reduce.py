def my_add(a,b):
	result = a+b
	print(f"{a} + {b} = {result}")
	return result
from functools import reduce
number = [1,2,3,4,5]
reduce(my_add,number)
print(reduce(my_add,number,100))