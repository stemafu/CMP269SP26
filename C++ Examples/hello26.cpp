
#include <iostream>


/* 

This is a multi-line comment in C++. This just in Java

*/

// This a single line comment in C++

/*
Let us write a simple program that prints to the screeen
the Hello World.
*/

/*


recall that C++ program exections start in the main
function.

*/

int main(){

    int x = 10;
    
    std::cout << "Hello World!\n"  ;
    std:: cout << "Lehman College in the Bronx.\n";


   int y = 2;


   

    if(y == 0){
        std::cerr << "error: You cannot divide a number by a zero";
        return -1;
    }

    int answer = 10/y;

    int total = 0;
    for(int i = 0; i <= 10; i++){
        total = sum(total, i);
        std::cout << i << "\n";
    }

    std::cout << "Total is = " << total << "\n";


    int i = 0;

    while(i <= x){
        std::cout << i << "\n";
        i++;
    }

    std::cout << x ;
    return 0;
}

// return type functionName(parameter list)
int sum(int num1, int num2){
    return num1 + num2;
}