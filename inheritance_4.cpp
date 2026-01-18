#include<iostream>
#include<string>
using namespace std;
class person
{
public:
    char n[30];
    int mark;
    int age;

    void setdata();
    void getdata();
};
void person::setdata()
{
    cout<<"Enter your name: ";
    cin>>n;
    cout<<"Enter your marks: ";
    cin>>mark;
    cout<<"Enter your age: ";
    cin>>age;
}
void person::getdata()
{
    cout<<"Name is: "<<n<<endl;
    cout<<"Mark is: "<<mark<<endl;
    cout<<"age is: "<<age<<endl;
}
class student:public person
{
public:
    int standard;
    char hobby[30];
    void setstandard()
    {
        cout<<"Standard: ";
        cin>>standard;
        cout<<"Hobby: ";
        cin>>hobby;
    }
    void getstandard()
    {
        cout<<"standard is: "<<standard<<endl;
        cout<<"hobby is: "<<hobby;
    }
};
int main()
{
    student s1;
    s1.setdata();
    s1.getdata();
    s1.setstandard();
    s1.getstandard();
}
