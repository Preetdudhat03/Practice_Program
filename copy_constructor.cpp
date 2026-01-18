#include<iostream>
using namespace std;
class A
{
public:
    int x;
    A()
    {
        x=10;
    }
    A(A&i)
    {
        x=i.x;
    }
    void putdata()
    {
        cout<<"\n= "<<x<<endl;
    }
};
main()
{
    A a1;
    A a2(a1);
    A cc=a2;
    a1.putdata();
    a2.putdata();
    cout<<cc.x;
}
