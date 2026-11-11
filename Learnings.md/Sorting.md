Sorting in Java

Sorting arranges values in an order, usually ascending or descending.

Example: 50, 20, 40, 10, 30 → 10, 20, 30, 40, 50

1. Bubble Sort

Idea: Compare adjacent elements and swap them if they are in the
wrong order. After each pass, the largest unsorted value moves to the
end.
int[] arr = {50, 20, 40, 10, 30};

for (int i = 0; i < arr.length - 1; i++) {
    for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
First pass: 50,20,40,10,30 → 20,50,40,10,30 → 20,40,50,10,30 →
20,40,10,50,30 → 20,40,10,30,50.

2. Selection Sort

Idea: Find the smallest value in the unsorted part and swap it into
the next correct position.
int[] arr = {50, 20, 40, 10, 30};

for (int i = 0; i < arr.length - 1; i++) {
    int minIndex = i;

    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }

    int temp = arr[i];
    arr[i] = arr[minIndex];
    arr[minIndex] = temp;
}

Passes: 10,20,40,50,30 → 10,20,40,50,30 → 10,20,30,50,40 →
10,20,30,40,50.

3. Insertion Sort

Idea: Take one value (key) and insert it into its correct position
in the already-sorted left part. Larger values shift one position right.

int[] arr = {50, 20, 40, 10, 30};

for (int i = 1; i < arr.length; i++) {
    int key = arr[i];
    int j = i - 1;

    while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
    }

    arr[j + 1] = key;
}

Progress: 50 → 20,50 → 20,40,50 → 10,20,40,50 →
10,20,30,40,50.

4. Merge Sort
Idea: Divide the array into halves until each part has one value.
Then merge the parts in sorted order.

static void mergeSort(int[] arr, int left, int right) {
    if (left >= right) return;

    int mid = left + (right - left) / 2;

    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);
    merge(arr, left, mid, right);
}

The merge() helper creates temporary left and right arrays, repeatedly
copies the smaller current value into the original array, and then
copies any remaining values. Start with

mergeSort(arr, 0, arr.length - 1);.
Complexity

Algorithm                     Best      Average        Worst   Extra space
Bubble Sort (basic)          O(n²)        O(n²)        O(n²)          O(1)
Selection Sort               O(n²)        O(n²)        O(n²)          O(1)
Insertion Sort                O(n)        O(n²)        O(n²)          O(1)
Merge Sort              O(n log n)   O(n log n)   O(n log n)          O(n)


- Bubble: compare adjacent values and swap.
- Selection: select the minimum value.
- Insertion: insert a value into the sorted portion.
- Merge: divide, sort, and merge.
- temp temporarily stores a value during swapping.