# Binary Search

## 1. Problem
Given a sorted array of integers `nums` and an integer `target`, search for `target` within `nums`. If `target` exists in the array, return its index. Otherwise, return `-1`.

## 2. Approach
The algorithm uses the Binary Search technique to find the target element:
1. Maintain two pointers, `left` at index `0` and `right` at index `nums.length - 1`.
2. Compute the middle index `mid` using `left + (right - left) / 2` to prevent potential integer overflow.
3. Compare `nums[mid]` with `target`:
    - If `nums[mid] == target`, return `mid`.
    - If `nums[mid] < target`, narrow the search to the right half by moving `left = mid + 1`.
    - If `nums[mid] > target`, narrow the search to the left half by moving `right = mid - 1`.
4. If `left` exceeds `right`, the target does not exist in the array, so return `-1`.

## 3. Time Complexity
**Time Complexity:** O(log n)

**Explanation:** In each iteration of the `while` loop, the search space is divided in half. Halving the array of size n step-by-step results in logarithmic performance in the worst case.

## 4. Space Complexity
**Space Complexity:** O(1)

**Explanation:** Only primitive variables (`left`, `right`, `mid`) are allocated to keep track of bounds and indices. No additional memory is used relative to the input size.

## 5. Reflection / Improvement
This O(log n) algorithm is optimal for sorted search. A brute-force linear search O(n) would check elements one by one, which is slower for large inputs.