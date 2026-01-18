#include<iostream>
using namespace std;
char stck[100];
int top=1;
void push(char x)
{
    stck[++top]=x;
}
char pop()
{
    if(top==1)
    {
        return -1;
    }
    else
    {
        return stck[top--];
    }
}
int precedence(char x)
    {
        if(x=='(')
        {
            return 0;
        }
        if(x=='+'||x=='-')
        {
            return 1;
        }
        if(x=='*'||x=='/'||x=='%')
        {
            return 2;
        }
        if(x=='^')
        {

            return 3;
        }
        return 0;
    }
int main()
{
    char exp[100];
    char x;
    int i;
    cout<<"Enter the expression";
    cin>>exp;
    cout<<"\n";
    i=0;
    while(exp[i]!='\0');
    {
        if(isalnum(exp[i]))
        {
            cout<<exp[i]<<" ";
        }
        else if(exp[i]=='(')
        {
            push(exp[i]);
        }
        else if(exp[i]==')')
        {
            while(x=pop()!='(')
            {
                cout<<x<<" ";
            }
        }
        else
        {
            while(precedence(stck[top])>=precedence(exp[i]))
            {
                cout<<pop()<<" ";
                push(exp[i]);
            }
        }
        i++;
    }
    while(top!=-1)
    {
        cout<<pop()<<" ";
    }
    return 0;
}
