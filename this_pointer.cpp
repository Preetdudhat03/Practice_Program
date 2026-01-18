#include<iostream>
using namespace std;
class test
{
    int x;
    public:
    void seta(int x)
    {

        this->x=x;
    }
    void geta()
    {
        cout<<x;
    }
};
int main()
{
    test tob;
    cout<<"Add. of tob"<<&tob<<endl;
    tob.seta(3);
    tob.geta();
}
