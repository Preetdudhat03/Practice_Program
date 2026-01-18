#include<iostream>
using namespace std;

class base
{
public:
    void display()
    {
        cout << "a";
    }
};

class derived : public base
{
public:
    virtual void display()
    {
        cout << "b";
    }
};

int main()
{
    derived d;
    d.display();
}
