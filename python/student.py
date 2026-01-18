d1 = {'Ajay':(1.89,77),'Krish':(1.77,65),'William':(1.80,68),'joho':(1.95,75)}
'''d2 = {key: value for key, value in d1.items() if value[0]>1.8 and value[1]>70}
print(d2)'''
'''d3 = {key: round(value[1]/(value[0]**2),2) for key, value in d1.items()}
print(d3)'''
d2={}
for k,(v1,v2) in d1.items():
	if v1>1.80 and v2>70:
		d2[k]=(v1,v2)
print(d2)
d3={}
for k,(v1,v2) in d1.items():
	bmi= v2/(v1**2)
	d3[k]=round(bmi,2)
print(d3)