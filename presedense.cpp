#include<iostream>
using namespace std;
main()
{
    int n=5-17*6;

    int n2=5-(17*6);

    int n3=(5-17)*6;

    cout<<"number 1 is: "<<n<<endl;
    cout<<"number 2 is: "<<n2<<endl;
    cout<<"number 3 is: "<<n3<<endl;

    //Operator associativity

    int a=1,b=4;

    b+=a-=6;

    cout<<"a: "<<a<<endl;
    cout<<"b: "<<b<<endl;

}
