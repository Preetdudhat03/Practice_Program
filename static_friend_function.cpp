#include<iostream>
using namespace std;

class base
{
public:
    static int num;
    static void fun(int a)
    {
        num=a;
    }
    void hun()
    {
        cout << num;
    }
};

int base::num;

int main()
{
    base b;
    base::fun(4);
    cout << base::num;
    b.hun();
}
