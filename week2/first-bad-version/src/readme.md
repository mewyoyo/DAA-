# First Bad Version

## 1. Problem
You are given n versions `[1, 2, ..., n]`. Once a version is marked bad, all subsequent versions are also bad. The goal is to find the index of the first bad version while minimizing the number of calls to `isBadVersion(version)`.

## 2. Approach
Because versions before the first bad version are good (`false`) and versions starting from the first bad version are bad (`true`), binary search is used to locate the exact boundary:
1. Initialize `left = 1` and `right = n`.
2. Compute `mid = left + (right - left) / 2`.
3. Check `isBadVersion(mid)`:
    - If `true`, `mid` is bad. The first bad version could be `mid` or on its left side, so set `right = mid`.
    - If `false`, `mid` is good. The first bad version must be to the right, so set `left = mid + 1`.
4. The loop runs until `left == right`, converging on the first bad version.

## 3. Time Complexity
**Time Complexity:** O(log n)

**Explanation:** The search range is halved with each API call. Halving a range of size n repeatedly takes O(log n) steps.

## 4. Space Complexity
**Space Complexity:** O(1)

**Explanation:** The search runs iteratively using only integer variables (`left`, `right`, `mid`), consuming constant space.

## 5. Reflection / Improvement
This is the most efficient binary search approach. A linear approach iterating from 1 to n would require O(n) API calls, which is far too slow for large n.