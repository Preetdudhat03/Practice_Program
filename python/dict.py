'''dict1 = {1:10,2:20}
dict2 = {3:30,4:40}
dict3 = {5:50,6:60}
dict4 = {**dict1,**dict2,**dict3}
print(dict4)
'''
'''
d1 = {1:'preet',2:'dudhat',3:'keya',4:'meetaben',5:'pareshbhai'}
k = int(input("Enter the number (1 to 5)"))
if k in d1 :
	print("found")
else:
	print("no found")

l1 = [1,2,3,4,5]
print("length = ",len(l1))

def greet(name):
	print("hello",name)
greet("preet")
square = lambda x : x**2
print("square = ",square(5))
'''
def week(i):
	switcher = {
	0:'monday',
	1:'tuesday',
	2:'wednesday',
	3:'thursday',
	4:'friday',
	5:'saturday',
	6:'sunday'
	}
	return switcher.get(i,'invalid day of week')
print(week(4))

l1 = [1,2,3,4,5,2,6,7,2,8]
sl = sorted(l1)
print(sl)
count = l1.count(2)
print(count)
ind = l1.index(3)
print(ind)