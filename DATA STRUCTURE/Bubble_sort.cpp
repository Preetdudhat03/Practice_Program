#include<iostream>
using namespace std;
int main()
{
    int i,j,n,t,k,f,ae;
    cout<<"How many element do you want : ";
    cin>>n;
    int a[n];
    cout<<"Enter the array element"<<endl;
    for(i=1;i<=n;i++)
    {
        cin>>a[i];
    }
    cout<<"Bubble Sort"<<endl;
    for(i=1;i<=n;i++)
    {
        f=0;
        for(j=0;j<n;j++)
        {
            if(a[j]>a[j+1])
            {
                swap(a[j],a[j+1]);
                f++;
            }

        }
        if(f!=0)
        {
            cout<<"pass "<<i<<" : ";
            for(k=1;k<=n;k++)
            {
                cout<<a[k]<<"\t"<<endl;
            }
        }

        cout<<endl;
    }

}
