#include<iostream>
#include<string.h>
#include<fstream>
using namespace std;

int main()
{
    ofstream outfile;
    outfile.open("demo.txt",ios::out);
    char name1;
    outfile.put('@');
    outfile.close();

    ifstream file;
    file.open("demo.txt",ios::in);
    char name;
    file.get(name);
    file.close();

    cout << name;

}
