#include <iostream>
#include <stack>
#include <string>
using namespace std;

bool isOperator(char c) {
    return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
}

int precedence(char c) {
    switch(c) {
        case '+': return 1;
        case '-': return 1;
        case '*': return 2;
        case '/': return 2;
        case '^': return 3;
        default: return -1;
    }
}

string infixToPostfix(const string &infix) {
    stack<char> s;
    string postfix;

    for(char c : infix) {
        if(isalpha(c)) { // operand
            postfix += c;
        }
        else if(c == '(') {
            s.push(c);
        }
        else if(c == ')') {
            while(!s.empty() && s.top() != '(') {
                postfix += s.top();
                s.pop();
            }
            if(!s.empty() && s.top() == '(')
            {
                s.pop();
            }
        }
        else if(isOperator(c)) {
            while(!s.empty() && precedence(c) <= precedence(s.top())) {
                postfix += s.top();
                s.pop();
            }
            s.push(c);
        }
    }

    while(!s.empty()) {
        postfix += s.top();
        s.pop();
    }

    return postfix;
}

int main() {
    string infix;
    cout << "Enter an infix expression: ";
    cin >> infix;

    cout << "Postfix expression: " << infixToPostfix(infix) << endl;

    return 0;
}
