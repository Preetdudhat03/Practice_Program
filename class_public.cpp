#include<iostream>
using namespace std;
class a
{
public:
    int a=10;
    void message();
};
void a::message()
{
    cout<<"Hello from the class a";
}
int main()
{
    a A;
    cout<<"The value of a: "<<A.a<<"\n";
    A.message();
}
