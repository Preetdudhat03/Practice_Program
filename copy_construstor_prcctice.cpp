#include<iostream>
using namespace std;
class a
{
    int a;
public:
    demo()
    {
        a=10;
    }
    demo(demo&z)
    {
        a=z.a;
    }
    void putdata()
    {
        cout<<"\n a=: "<<a;
    }
};
main()
{
    demo aa;
    demo bb(aa);
    demo cc=bb;

}
