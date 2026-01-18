#include<iostream>
using namespace std;
class A
{
protected:
    int x;

    int fun()
    {
        return 2*x;
    }
};
int main()
{
    A obj;
    obj.x=9;
    cout<<"obj.x"<<endl;
    cout<<obj.fun();
}
