print("Hello World")
print("Welcome to Lehman College in the Bronx")
print('Lehman College is part of CUNY')

name = "Drink Water"

print(type(name))


# name = 10
# print(type(name))


print(name)

# string indexing allow to access a value at an index in the string
# syntax: stringName[indexNumber]
print(name[0], "\nJonny Depp")


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



# loops in Python

# for loop structure
# for (item in sequence):
#    # the body of the for loop
# Examples of a sequence include:
# lists, string, tuples

print("\nThese are some of the CUNY Colleges that we know:")
for college in listCUNYColleges:
    print(college)


alphabet = "ABCDEFGHIJKLMNOPQRSTVUWXYZ"
print("Charaters (Letters) from the English Alphabet:")
count = 0
countDown = -1
for letter in alphabet:
    # The body of the for start here with this comment
    print(letter)
    count = count + 1
    print(alphabet[countDown])
    countDown = countDown - 1;



# Python allow negative indexes for sequences.
print("Here is the last letter in the alphabet", alphabet[-1])
print("Here is the last letter in the alphabet", alphabet[25])



print("Here is the next to the last letter in the alphabet", alphabet[-2])
print("There are ", count, " letters in the English alphabet.")