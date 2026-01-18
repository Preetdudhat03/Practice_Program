#include<iostream>
using namespace std;
class Base
{
public:
    virtual void display()
    {
        cout<<"Display Base"<<endl;
    }
    virtual void show()
    {
             cout<<"Show Base"<<endl;
    }
};
class Derived:public Base
{

public:
    void display()
    {
        cout<<"Display derived "<<endl;
    }
    void show()
    {
             cout<<"Show derived"<<endl;
    }
};
int main()
{
    Base *bptr;
     Base b;
     bptr=&b;

     bptr->display();
     bptr->show();

     Derived d;
     bptr= &d;

          bptr->display();

          bptr->show();


}
