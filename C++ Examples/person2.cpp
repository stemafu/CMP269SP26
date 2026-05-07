#include <iostream>
#include <string>

using namespace std;


class person2{
    private:
    int age;
    double gpa;
    string name;
    

    public:
    // To create a constructor, use the same name as the class, followed by parentheses ():
    // Constructor overloading
    person2(){
        age = 0;
        gpa = 0.0;
        name = "";
    }
    
    person2(int newAge, double newgpa, string newName){
        if(newAge <= 0){
            age = 0;
        }else{
            age = newAge;
        }

        if(newgpa <= 0){
            gpa = 0.0;
        }else{
            gpa = newgpa;
        }

        name = newName;

    }


    //These methods are all defined inside a class
    void setAge(int newAge){
        if(newAge <= 0){
            age = 0;
        }else{
            age = newAge;
        }
        
    }

    void setGPA(double newgpa);

    int getAge(){
        return age;
    }

    double getGPA(){
        return gpa;
    }

    string getName(){
        return name;
    }

    void setName(string newName){
        name = newName;
    }

    void display(); // Method/function declaration
};


/* To define (implement) a method that has been declared
inside a class, we need to provide the name of the class,
followed by the resolution operator, ::, and then the method name.
Before this, you need to provide the return type.

*/

void person2::display(){
    // extraction operator <<
    cout << "Age: " << age << "\n";
    cout << "GPA: " << gpa << "\n";
    cout << "Name: " << name << "\n";
}

void person2::setGPA(double newgpa){
    gpa = newgpa;
}




int main(){

    person2 p2;
    p2.setAge(7);
    cout << p2.getAge() << "\n";

    person2 p1(10, 5.0, "Drink Water");

    /* We can access a method using the dot operator
    We create the object of the class
    and the we use the object and the dot
    operator to access the methods of the class.
    */
    p1.setAge(8);

    cout << "Age = " << p1.getAge() << "\n";
    cout << "GPA = " << p1.getGPA() << "\n";

    p1.display();

    string s = "Lehman College";

    cout << s[5] << "\n";
    cout << s.at(5) << "\n";
    cout << s.length() << "\n";
    cout << s.size() << "\n";
    return 0;
}

/* 
1. We can be able to define and implement a method inside a 
class

2. We can be able to implement a method for a class outside of the class.

*/