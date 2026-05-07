
#include <iostream>
using namespace std;

int main(){

    int num = 50;
    int& numReference = num;

    cout << "Number is " << num << "\n";
    cout << "Number is " << numReference << "\n";
    cout << "Number address is " << &numReference << "\n";
    return 0;
}