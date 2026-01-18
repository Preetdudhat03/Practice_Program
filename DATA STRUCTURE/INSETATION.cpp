#include<iostream>
using namespace std;
main()
{
    int n=5,j,k,i,a[6];
    cout<<"Enter any five number "<<endl;
    for (j=0;j<5;j++)
    {
        cin>>a[j];
    }
    cout<<"enter location that you want add number ";
    cin>>k;

    for(j=n;j>=k;j--)
    {
        a[j+1]=a[j];
    }
    cout<<"Enter any number which you want to add ";
    cin>>i;

    a[k]=i;
    for(j=0;j<6;j++)
    {
        cout<<a[j];
    }

}
