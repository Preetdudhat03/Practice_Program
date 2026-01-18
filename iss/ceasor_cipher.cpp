#include<iostream>
using namespace std;
int main()
{

    int i,n,key;
    string en,de,name;
    cout<<"Enter the string = ";
    getline(cin,name);
    cout<<"Enter the key = ";
    cin>>key;


    for(i=0;i<name.length();i++)
    {

        en +=char(int(name[i]+key));
    }

    cout<<"Encrypted text = "<<en<<endl;

    for(i=0;i<name.length();i++)
    {

        de +=char(int(en[i]-key));
    }
    cout<<"Decrypted text = "<<de;
}

