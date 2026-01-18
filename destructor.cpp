#include<iostream>
using namespace std;
class employee
{
public:
    employee()
    {
        cout<<"constructor invoked"<<endl;
    }
    ~employee()
    {
        cout<<"destructor invoked"<<endl;
    }
};
main()
{
    employee e1;
    employee e2;
}
