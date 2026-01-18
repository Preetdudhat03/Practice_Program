#include<iostream>
#include<fstream>
#include<string>
using namespace std;

int main()
{
    char message[100]= "My name is arumugavel";
    char name[100];
    ofstream fout;
    fout.open("demo.txt",ios::out);
    fout.write(message,100);
    fout.close();

    ifstream out;
    out.open("demo.txt",ios::in);
    out.read(name,100);
    out.close();
    cout << name;
}
