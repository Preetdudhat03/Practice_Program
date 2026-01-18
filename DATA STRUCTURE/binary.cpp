/*#include<iostream>
using namespace std;
main()
{
    int n;
    cout<<"How many number you want to add in array? "<<endl;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    int key;
    cout<<"Enter whatever element you choose "<<endl;
    cin>>key;
    int e=n;
    for(s=0;s<=e;s++)
    {
    int loc =-1;
        int mid = (s+e)/2;
        if(a[mid]==key)
        {
            loc = mid;
            break;
        }
        else if(a[mid]<key)
        {
            s = mid+1;
        }
        else{
            e= mid-1;
        }
    }
    return -1;
}*/

#include <iostream>
using namespace std;

void BUBBLE(int A[], int N) {
    for (int K = 1; K <= N-1 ; K++) {
         int PTR = 1;
         //for(int PTR=1;PTR<=N-K;PTR++){
         while(PTR <= N - K){
            if (A[PTR] > A[PTR + 1]) {
                int temp = A[PTR];
                A[PTR] = A[PTR + 1];
                A[PTR + 1] = temp;
            }
            PTR=PTR+1;
        }
        //PTR =PTR +1;
    }
}
int B_SEARCH(int A[], int N, int item) {
    int LOC = -1;
    int B = 0, E = N ;
    while (B <= E) {
        int mid = (B + E) / 2;
        if (item == A[mid]) {
            LOC = mid;
            break;
        } else if (item > A[mid]) {
            B = mid + 1;
        } else {
            E = mid - 1;
        }
    }
    return LOC;
}

int main() {
    int N;
    cout << "Enter the number of elements: ";
    cin >> N;
    int A[N];
    cout << "Enter " << N << " elements:" << endl;
    for (int i = 1; i <=N; i++) {
        cin >> A[i];
    }

    BUBBLE(A, N);
    cout << "Sorted array:" << endl;
    for (int i = 1; i <= N; i++) {
        cout << A[i] << endl;
    }
    int item;
    cout << "Enter the item to search for: ";
    cin >> item;
    int location = B_SEARCH(A, N, item);
    if (location != -1) {
        cout << "Item " << item << " found at index " << location << "." << endl;
    } else {
        cout << "Item " << item << " not found in the array." << endl;
    }
    return 0;
}



