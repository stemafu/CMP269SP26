#include <iostream>
using namespace std;

class IntArrayList{
    private:
    int count;
    int* elements = new int[10];

    public:
    IntArrayList(){
        count = 0;
    }


    /*

    In C++, the destructor has the same name as the class,
    preceded by a tilde (~), such as ~ClassName().

    Destructors cannot accept arguments and cannot return values (not even void).
    */
    
    ~IntArrayList(){
        delete [] elements;
    }
    

    bool isEmpty();

    /*
    size() and length return the amount of nums currently
    stored in the list*/
    int size();

    int length();

    /* This adds the nums at the back of the 
    back of the array.
    */
    void add(int num);

        /* This adds the nums at the specified index
         of the array.
    */
    void add(int num, int index);

    /*
    This method returns the number at the speficied
    index.
    */
    int get(int index);

    /*
    This removes and returns the number at the specified 
    index;
    */
    int remove(int index);

    /*
    This just clears the list.
    */
    int removeAll();


    private:
    void resize();

};

bool IntArrayList::isEmpty(){
    /*if( count == 0)
       return true;
    else 
       return false;*/
    return (count == 0);
}

void IntArrayList::add(int num){
    if(count == sizeof(elements)/ 4){
        //cout << "The list is full" << "\n";
        //return;
        // resize the array
        resize();
    }

    elements[count] = num;
    count++;
}

void IntArrayList::resize(){
    int arraySize = sizeof(elements) / 4;
    int* elementsCopy = new int[  arraySize * 2 ];

    for(int i = 0; i < count; i++ ){
        elementsCopy[i] = elements[i];
    }

    // Clean up memory
    delete [] elements;

    elements = elementsCopy;
}

int IntArrayList::length(){
    return count;
}

int IntArrayList::size(){
    return length();
}

/*
This method takes an int and returns the number
at the index
*/
int IntArrayList::get(int index){


    if(index < 0 || index > count){
        cout << "The index you provided is invalid . \n";
        return -1;
    }


    return elements[index];
}


int IntArrayList::remove(int index){

    if(index < 0 || index >= count){

        cout << "The provided index is not valid!\n";
        return -1; // we can throw an exception
    }

    /*
    Get the value that we want to remove from the 
    list(array).
    */
    int removedNumber = elements[index];

    // Shift the values

    for(int i = index; i < count - 1; i++){
        elements[i] = elements[i + 1];
    }
    //reduce count
    count--;


    /* Once we are done shifting, we returned the
    removed value
    */

    return removedNumber;
}


int main(){

    IntArrayList nums;
     
    cout << nums.isEmpty() << "\n";

    nums.add(10);
    nums.add(20);
 
    int start = 10;
    for (int i = 0; i <= 150; i++){

        nums.add(start);
        start = start + 10;
    }

    cout << nums.isEmpty() << "\n";
    cout << "The size of the list is " << nums.size() << "\n";
    cout << "The size of the list is " << nums.length() << "\n";
    
    cout << "testing the get method " << nums.get(0) << "\n";
    cout << "testing the get method " << nums.get(150) << "\n";
    
    return 0;
}