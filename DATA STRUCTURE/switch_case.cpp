#include<iostream>
using namespace std;
int main()
{
    int a[6],k=3,j,n=6,i=9,ch;
    cout<<" MENU "<<endl;
    cout<<"1. Insert"<<endl;
    cout<<"2. Delete"<<endl;
    cout<<"3. Exit"<<endl;

    cout<<endl<<"Enter your choice ";
    cin>>ch;
    switch(ch)
    {
    case 1:
        cout<<endl<<"Enter array ";
        for(j=0;j<5;j++)
        {
            cin>>a[j];
        }
        for(j=n;j>=k;j--)
        {
            a[j+1]=a[j];
        }
        a[k]=i;
        for(j=0;j<6;j++)
        {
            cout<<a[j];
        }
        break;

    case 2:
        cout<<"Enter array "<<endl;
        for(j=0;j<6;j++)
        {
            cin>>a[j];
        }
        for(j=k;j<n;j++)
        {
            a[j]=a[j+1];
        }
        i=a[k];
        for(j=0;j<5;j++)
        {
            cout<<a[j];
        }
        break;

    case 3:
        break;

    default:
        cout<<"Enter corrent choice!!!";
    }
}
