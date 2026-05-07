#include <iostream>

class person1{
    // The body of the C++ program goes here
    public:
    int age;
    int gpa;
};


int main(){

    // let us create an object using the 

    person1 p1;

    /* because the variables age and gpa are public
    We can easily be able to access them.

    If we want to access an instance variable inside a 
    C++ class, we can use the dot operator to access the
    variable.

    General syntac:
    objectname.instanceVariableName

    */
   p1.age = -10;
   p1.gpa = 4;

   std::cout << p1.age << "\n";

   return 0;

}