#include<iostream>
using namespace std;
int dec(int n);
int main()
{
    int n;
    cout<<"Enter decimal number: ";
    cin>>n;

    cout<<"binary number of "<<n<<" = "<<dec(n);
}
int dec(int n)
{
    int bin=0,i=1;
    while(n!=0)
    {
        bin=bin+(n%2)*i;
        n=n/2;
        i=i*10;
    }
    return bin;
}
