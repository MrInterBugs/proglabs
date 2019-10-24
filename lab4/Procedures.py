def loop(n, x):
	for i in range(1, n):
		x = x * i
	return x

def loop2(n, x, y):
	for i in range(1, n):
		x = x * (y/6)
	return x

x = loop(5, 1)
y = loop(3, 1)
z = loop(2, 1)

c = x / (y * z)

p = loop2(3, 1, 1)
q = loop2(2, 1, 5)

result = c * p * q
print(result)
