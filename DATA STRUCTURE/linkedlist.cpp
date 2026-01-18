#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node* next;
};

Node* start = nullptr;

void createLL();
void traverseLL();
void insert_before();
void insert_after();
void delete_beg();
void delete_end();
void insert_beg();
void insert_end();

int main()
{
    int option;
    do
    {
        cout << "\n\n **MAIN MENU **\n";
        cout << "\n 1: Create a list";
        cout << "\n 2: Traverse the list";
        cout << "\n 3: Insert before a given node";
        cout << "\n 4: Insert after a given node";
        cout << "\n 5: Delete at beginning of list";
        cout << "\n 6: Delete at end of the list";
        cout << "\n 7: Insert at beginning of list";
        cout << "\n 8: Insert at end of the list";
        cout << "\n 9: EXIT";
        cout << "\n\n Enter your option : ";
        cin >> option;
        switch (option)
        {
        case 1:
            createLL();
            cout << "\n LINKED LIST CREATED";
            break;
        case 2:
            traverseLL();
            break;
        case 3:
            insert_before();
            break;
        case 4:
            insert_after();
            break;
        case 5:
            delete_beg();
            break;
        case 6:
            delete_end();
            break;
        case 7:
            insert_beg();
            break;
        case 8:
            insert_end();
            break;
        }
    } while (option != 9);
    return 0;
}

// Function to create Linked List
void createLL()
{
    Node* new_node, *ptr;
    int num;
    cout << "\n Enter -1 to end";
    cout << "\n Enter the data : ";
    cin >> num;
    while (num != -1)
    {
        new_node = new Node;
        new_node->data = num;
        new_node->next = nullptr;

        if (start == nullptr)
        {
            new_node->next = nullptr;
            start = new_node;
        }
        else
        {
            ptr = start;
            while (ptr->next != nullptr)
                ptr = ptr->next;
            ptr->next = new_node;
        }
        cout << "\n Enter the data : ";
        cin >> num;
    }
}

// Function to Traverse Linked List
void traverseLL()
{
    Node* ptr = start;
    while (ptr != nullptr)
    {
        cout << ptr->data << "\t" << ptr->next << endl;
        ptr = ptr->next;
    }
}

void insert_before()
{
    Node* new_node, * ptr, * preptr;
    int num, val;
    cout << "\n Enter the data : ";
    cin >> num;
    cout << "\n Enter the value before which the data has to be inserted : ";
    cin >> val;
    new_node = new Node;
    new_node->data = num;
    ptr = start;
    while (ptr->data != val) {
        preptr = ptr;
        ptr = ptr->next;
    }
    preptr->next = new_node;
    new_node->next = ptr;
}

void insert_after()
{
    Node* new_node, * ptr, * preptr;
    int num, val;
    cout << "\n Enter the data : ";
    cin >> num;
    cout << "\n Enter the value after which the data has to be inserted : ";
    cin >> val;
    new_node = new Node;
    new_node->data = num;
    ptr = start;
    preptr = ptr;
    while (preptr->data != val)
    {
        preptr = ptr;
        ptr = ptr->next;
    }
    preptr->next = new_node;
    new_node->next = ptr;
}

void delete_beg()
{
    Node* ptr;
    ptr = start;
    start = start->next;
    delete ptr;
}

void delete_end()
{
    Node* ptr, * preptr;
    ptr = start;
    while (ptr->next != nullptr)
    {
        preptr = ptr;
        ptr = ptr->next;
    }
    preptr->next = nullptr;
    delete ptr;
}

void insert_beg()
{
    Node* new_node;
    int num;
    cout << "\n Enter the data : ";
    cin >> num;
    new_node = new Node;
    new_node->data = num;
    new_node->next = start;
    start = new_node;
    cout << "\n New node inserted at the beginning";
}

void insert_end()
{
    Node* ptr, * new_node;
    int num;
    cout << "\n Enter the data : ";
    cin >> num;
    new_node = new Node;
    new_node->data = num;
    new_node->next = nullptr;
    ptr = start;
    while (ptr->next != nullptr)
        ptr = ptr->next;
    ptr->next = new_node;
    cout << "\n New node inserted at the end";
}
