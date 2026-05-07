print("Hello World")
print("Welcome to Lehman College in the Bronx")
print('Lehman College is part of CUNY')

name = "Drink Water"

print(name)

# string indexing allow to access a value at an index in the string
# syntax: stringName[indexNumber]
print(name[0], "\nJonny Depp");


listCUNYColleges = ["Lehman College", "BCC", "Hostos", "Baruch", "Hunter", "City Tech", "CCNY"]

print(listCUNYColleges[0])

# the following line creates an empty list with no elements.
studentsList = []
#the following line add the name Drink Water to the list
studentsList.append("Drink Water")

print(studentsList[0])

# to define (create) a function in python, we use the keyword def.
# Each and every Python function return a value.
# As such we do not put a return for Python functions.
#
# If you write Python function that is not returning a value, then
# automatically Python returns a None.
#


def test():
    x = 5
    return x

print(test())


