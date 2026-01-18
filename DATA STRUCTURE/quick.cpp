/*#include <iostream>
using namespace std;

void quickSort(int &arr) {
    if (arr.size() <= 1) {
        return;
    }

    int pivot = arr[0];
    int less, greater;

    for (size_t i = 1; i < arr.size(); ++i) {
        if (arr[i] <= pivot) {
            less.push_back(arr[i]);
        } else {
            greater.push_back(arr[i]);
        }
    }

    quickSort(less);
    quickSort(greater);

    arr.clear();
    arr.insert(arr.end(), less.begin(), less.end());
    arr.push_back(pivot);
    arr.insert(arr.end(), greater.begin(), greater.end());
}

int main() {
    int n;
    std::cout << "Enter the number of elements: ";
    std::cin >> n;

    std::vector<int> arr(n);

    std::cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; ++i) {
        std::cin >> arr[i];
    }

    quickSort(arr);

    std::cout << "Sorted array: ";
    for (int num : arr) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}*/
#include <iostream>
using namespace std;

void swap(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j <= high - 1; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(arr[i], arr[j]);
        }
    }
    swap(arr[i + 1], arr[high]);
    return i + 1;
}

void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);

        cout << "Pass: ";
        for (int i = low; i <= high; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

int main() {
    int arr[100], size;


    cout << "Enter the size of the array: ";
    cin >> size;

    cout << "Enter array elements: ";
    for (int i = 0; i < size; i++) {
        cin >> arr[i];
    }

    quickSort(arr, 0, size - 1);

    cout << "Sorted array: ";
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
