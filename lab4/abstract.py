import math

print ((-3 - math.sqrt(3 * 3 - 4 * 2 * -5)) / (2 * 2))
print ((-3 + math.sqrt(3 * 3 - 4 * 2 * -5)) / (2 * 2))

#1. This is the quadratic formula so there is the variables a, b and c.
#2. the math.sqrt(3 * 3 - 4 * 2 * -5) is the common sub expression and should be called the discriminate.

def discriminate(a, b, c):
    return math.sqrt(b * b - 4 * a * c)

def quadratic(a, b, x):
    print((-b - x) / (2*a))
    print((-b + x) / (2*a))

a = 2
b = 3
c = -5

x = discriminate(a, b, c)

quadratic(a, b, x)

