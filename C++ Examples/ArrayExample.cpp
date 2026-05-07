#include <iostream>
using namespace std;
int main(){

    /* To create an array in C++, we first specify
    the data type of the array, followed by the name of the
    array and the []. In between the [] brackets you may
    specify the desired capacity of your array.*/

    int nums[15];

    /*
    How many bytes can int in C++ keep?
    4 bytes.
    */

    nums[0] = 9;

    cout << "Size is " << sizeof(nums) / 4 << "\n";
    

    return 0;
}