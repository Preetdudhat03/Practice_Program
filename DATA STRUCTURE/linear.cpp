#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"How many number you want to add in array? "<<endl;
    cin>>n;
    int a[n];
    for(int i=1;i<=n;i++)
    {
        cin>>a[i];
    }
    int key;
    cout<<"Enter whatever element you choose "<<endl;
    cin>>key;
    for(int ind=1;ind<=n;ind++)
    {
        if(a[ind]==key)
        {
            cout<<"array index = "<<ind<<endl;
        }
    }
    return -1;
}
