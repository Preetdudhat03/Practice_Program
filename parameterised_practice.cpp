#include<iostream>
using namespace std;
class box
{
public:
    int a;
    box(int m);
    void display();

};
box::box(int m)
{
    a=m;
}
void box::display()
{
    cout<<"Entered number is: "<<a<<endl;
}
main()
{
    int b;
    cout<<"Enter any number: "<<endl;
    cin>>b;
    box c(b);
    c.display();
}
