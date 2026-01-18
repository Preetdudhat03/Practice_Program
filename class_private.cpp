#include<iostream>
using namespace std;
class A
{
public:
int a = 10;
void message(); 	//declaration of the function named message()
};
//Defition of the function message of class A
void A :: message()
{
cout<< "Hello from the class A";
}
int main()
{
A ob;		//Creating an object of class A
//Accessing the data member a, associated with the object of class A
cout<< "The value of a : " << ob.a << "\n";
//Calling the function message of class A, using its object
ob.message();
}
