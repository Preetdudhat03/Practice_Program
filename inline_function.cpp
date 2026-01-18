#include<iostream>
using namespace std;
class sum
{
public:
    void fun();
};
inline void sum::fun()
{
    cout<<"done";
}
int main()
{
    sum s;
    s.fun();
}
