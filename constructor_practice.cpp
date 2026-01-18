#include<iostream>
using namespace std;
class box
{
public:
    int a;
    box();
    void display();

};
box::box()
{
    cout<<"Enter any number: "<<endl;
    cin>>a;
}
void box::display()
{
    cout<<"Entered number is: "<<a<<endl;
}
main()
{
    box b;
    b.display();
}
