#include<iostream>
using namespace std;
main()
{
    int n,j,i;
    char c;
    cout<<"how many number you want to check: ";
    cin>>j;
    cout<<"Enter number: ";
    for(i=0;i<=j;i++)
    {
        cin>>n;
        c = (char)n;
        cout<<"ascii is = "<<c<<endl;
    }

}

