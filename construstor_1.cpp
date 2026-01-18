#include<iostream>
using namespace std;
class circle
{
    int r;
    float a;
public:
    circle();
    ~circle();
    void input();
    void display();
};
circle::circle()
{
    cout<< "try: "<<endl;
}

void circle::input()
{
    cout<<"Enter the radius of the circle: ";
    cin>>r;
    a = 3.14*r*r;
}
void circle::display()
{
    cout<<"The area of the circle is: "<<a<<endl;
}
circle::~ circle()
{
    cout<<"distroyed!!!!";
}
main()
{
    circle c;
    c.input();
    c.display();

}
