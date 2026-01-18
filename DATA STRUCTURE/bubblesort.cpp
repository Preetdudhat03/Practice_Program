#include<iostream>
using namespace std;
main()
{
    int i,n,a[20],c;
    cout<<"Enter array number ";
    cin>>n;
    cout<<"Enter array element ";
    for(i=1;i<=n;i++)
    {
        cin>>a[i];
    }
    for(c=1;c<=n-1;c++)
    {
        for(i=1;i<=n-c;i++)
        {
            if(a[i]>a[i+1])
            {
                int temp;
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
    for(i=1;i<=n;i++)
    {
        cout<<a[i]<<" ";
    }
}
