Str = input("Enter the string = ")
uc = 0
lc = 0
v='aeiouAEIOU'
vowel = 0
n=0 
c = 0
for i in Str:
	if i.isupper():
		uc+=1
	elif i.islower():
		lc+=1
	if i.isalpha():
		if i in v:
			vowel+=1
	if i.isnumeric():
		n+=1
	else :
		c+=1
print("Upper Case = ",uc)
print("Lower Case = ",lc)
print("Vowel = ",vowel)
print("Sign = ",c)
print("numbers = ",n)