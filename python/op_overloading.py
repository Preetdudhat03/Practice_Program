class point:
	def __init__(self ,x1,y1):
		self.x = x1
		self.y = y1
	def __str__(self):
		return "x = {0}, y = {1}".format(self.x,self.y)
	def __add__(self,other):
		x = self.x + other.x
		y = self.y + other.y
		return point(x,y)
p1 = point(1,2)
p2 = point(2,3)
print(p1 + p2)