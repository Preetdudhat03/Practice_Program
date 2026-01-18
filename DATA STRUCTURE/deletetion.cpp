#include<iostream>
using namespace std;
main()
{
    int a[6]={1,2,3,4,5,6},i,k,n=6,j;
    cout<<"Enter the string "<<endl;
    for(j=0;j<6;j++)
    {
        cin>>a[j];
    }
    cout<<endl;
    cout<<"Which number's location you want remove from string "<<endl;
    cin>>k;
    for(j=k;j<n;j++)
    {
        a[j]=a[j+1];
    }
    for(j=0;j<5;j++)
    {
        cout<<a[j];
    }
}
