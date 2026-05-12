

def letterGrade(midterm, final):

    mid = midterm * 0.4
    fin = final * 0.6

    totalScore = mid + fin
    grade = ""
    if totalScore > 92:
        grade = "A"
    elif totalScore > 89:
        grade = "A-"
    elif totalScore > 86:
        grade = "B+"        
    elif totalScore >= 83:
        grade = "B"
    elif totalScore >= 80:
        grade = "B-"
    elif totalScore > 76:
        grade = "C+"        
    elif totalScore > 72:
        grade = "C"
    elif totalScore > 69:
        grade = "B-"
    elif totalScore > 66:
        grade = "D+"        
    elif totalScore >= 63:
        grade = "D"
    elif totalScore >= 60:
        grade = "D-"
    else:
        grade = "F"
    
    return grade

# In order for us to read from a CSV or text file,
# we need to first open the file

# The data contains a student, midterm score, final score
# Let say the midterm is 40 percent of the final letter grade
# final score is 60 percent of the final letter grade
# let us computer the letter grade for each student
file = open("studentData.csv" , "r")
lines = file.readlines()
#print(file.readlines())
count = 0
for line in lines:
    if(count >= 1):
        #take the line and convert into a list
        lineList = line.split(",")
        
        midT = int(lineList[1].replace("\n", ""))
        finalE = int(lineList[2].replace("\n", ""))
        
        print(lineList[0], midT, finalE, letterGrade(midT, finalE) )
    
    count = count + 1

file.close()