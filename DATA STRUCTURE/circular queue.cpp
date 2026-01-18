#include <iostream>
using namespace std;

// A function to check if the queue is empty
bool isEmpty(int front, int rear) {
    return (front == -1 && rear == -1);
}

// A function to check if the queue is full
bool isFull(int front, int rear, int size) {
    return (rear+1== front);
}

// A function to insert an element at the rear of the queue
void enqueue(int arr[], int& front, int& rear, int size) {
    int element;
    cout << "Enter the element to be inserted: ";
    cin >> element;
    if (isFull(front, rear, size)) {
        cout << "Queue is full. Cannot insert.\n";
        return;
    }
    if (isEmpty(front, rear)) {
        front = 0;
        rear = 0;
    }
    else {
        rear++;
    }
    arr[rear] = element;
    cout << "Element inserted.\n";
}

// A function to delete an element from the front of the queue
void dequeue(int arr[], int& front, int& rear, int size) {
    if (isEmpty(front, rear)) {
        cout << "Queue is empty. Cannot delete.\n";
        return;
    }
    if (front == rear) {
        front = -1;
        rear = -1;
    }
    else {
        front++;
    }
    cout << "Element deleted.\n";
}

// A function to display the queue
void display(int arr[], int front, int rear, int size) {
    if (isEmpty(front, rear)) {
        cout << "Queue is empty.\n";
        return;
    }
    cout << "Queue: ";
    for (int i = front; i != rear; i++) {
        cout << arr[i] << " ";
    }
    cout << arr[rear] << "\n";
}

int main() {
    int size; // The size of the queue
    int choice; // The choice of operation
    int front = -1; // The index of the front of the queue
    int rear = -1; // The index of the rear of the queue

    cout << "Enter the size of the queue: ";
    cin >> size;

    // Declare an array of given size
    int arr[size];

    // Display a menu of operations
    cout << "Menu:\n";
    cout << "1. Enqueue\n";
    cout << "2. Dequeue\n";
    cout << "3. Display\n";
    cout << "4. Exit\n";

    do {
        // Ask the user for their choice
        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice) {
            case 1: enqueue(arr, front, rear, size); // Insert an element
                    break;
            case 2: dequeue(arr, front, rear, size); // Delete an element
                    break;
            case 3: display(arr, front, rear, size); // Display the queue
                    break;
            case 4: break; // Exit the program
            default: cout << "Invalid choice.\n"; // Handle invalid input
        }

        display(arr, front, rear, size); // Display the queue after each operation

    } while (choice != 4);

    return 0;
}

