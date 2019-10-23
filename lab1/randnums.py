import random
import math

numlist = []
p = 0

for i in range(0,1000):
    x = random.randint(1,10)
    numlist.append(x)
for i in range(1,11):
	tot = numlist.count(i)
	print(tot)
	tot = int(tot)
	p = p+((tot-100)**2/100)
	print(" ")
print(p)
