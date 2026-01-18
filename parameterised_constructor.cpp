#include<iostream>
using namespace std;
class employee
{
public:
    int id;
    string name;
    float salary;
    employee(int i,string n,float s)
    {
        id=i;
        name=n;
        salary=s;
    }
    void display()
    {
        cout<<"id= "<<id;
        cout<<"name= "<<name;
        cout<<"salary= "<<salary;
    }

    ~employee()
    {
        cout << endl;
        cout << "Dis called";
    }
};
main()
{
    employee e1(1,"arumughavel",50000);
    employee e2(2,"mithilesh",30000);

    e1.display();
    e2.display();


}

