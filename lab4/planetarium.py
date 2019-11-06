import math

# The standard gravitational parameter for the sun
mu = 1.327 * math.pow(10, 20)

def volume(
):
    v = (4 / 3) * math.pi * math.pow(r, 3)
    return str(v)

def surface(r):
    area = 4 * math.pi * math.pow(r, 2)
    return str(area)
class Planet:
    def __init__(self, name, radius, moons):

e = Planet("Earth", 6371, 1)
j = Planet("Jupiter", 69911, 79)

# Print physical characteristics of the Earth
if moons == 1:
    moons = str(moons) + " moon"
else:
    moons = str(moons) + " moons"
print (name + " has a volume of " + volume(radius) + " cubic km, a surface area of " + surface(radius) + " sq. km, and " + moons)

# Print dynamic characteristics of the Earth
orbital_radius = 1.496 * math.pow(10, 11)
period = 2 * math.pi * orbital_radius * math.sqrt(orbital_radius / mu)
print (name + " has a year of approximately " + str(period // (60 * 60 * 24)) + " days")

# Print physical characteristics of Jupiter
if moons == 1:
    moons = str(moons) + " moon"
else:
    moons = str(moons) + " moons"
print (name + " has a volume of " + volume(radius) + " cubic km, a surface area of " + surface(radius) + " sq. km, and " + moons)

# Print dynamic characteristics of Jupiter
orbital_radius = 7.786 * math.pow(10, 11)
period = 2 * math.pi * orbital_radius * math.sqrt(orbital_radius / mu)
print (name + " has a year of approximately " + str(period // (60 * 60 * 24)) + " days")