#include<iostream>
using namespace std;
main()
{
    int n,i,j,a[20];
    cout<<"Enter array length ";
    cin>>n;
    cout<<"Enter array element "<<endl;
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n-1;i++)
    {
        int mini=i;
        for(j=i+1;j<n;j++)
        {
            if(a[j]<a[mini])
            {
                mini=j;
            }

        }
        if(mini!=i)
        {
            swap(a[i],a[mini]);
        }
    }
    for(i=0;i<n;i++)
    {
        cout<<a[i];
    }
}
