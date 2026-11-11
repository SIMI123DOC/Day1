Searching in Java

Searching means finding whether a target value exists and, if it does,
identifying its index.

Example: array {10, 20, 30, 40, 50}, target 30 → index 2.

1. Linear Search

Idea: Check elements one by one until the target is found or the
array ends. It works on sorted and unsorted arrays.

2. Binary Search

Idea: Check the middle value. If the target is smaller, continue in
the left half; if larger, continue in the right half. The array must
be sorted.

Complexity
  Search     Best    Average      Worst  Requirement
  Linear     O(1)       O(n)       O(n)  Any array
  Binary     O(1)   O(log n)   O(log n)  Sorted array
