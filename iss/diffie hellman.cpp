#include<iostream>
#include<math.h>
#include<cmath>
using namespace std;
int main()
{
    long int a,b;
    long int x = 23,y = 5;
    cout<<"Enter Alice`s key = ";
    cin>>a;
    cout<<"Enter Bob`s key = ";
    cin>>b;
    long int A = fmod(pow(y,a),x);
    long int B = fmod(pow(y,b),x);
    long int S = fmod(pow(B,a),x);
    cout<<S<<endl;
    long int G = fmod(pow(A,b),x);
    cout<<G<<endl;
    cout<<"Alice and bob have a shared secret"<<endl;
    return 0;

}
