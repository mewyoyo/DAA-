// Заглушка для локальной работы и компиляции в IntelliJ IDEA
class VersionControl {
    boolean isBadVersion(int version) {
        return false;
    }
}

/*
 * Решение для LeetCode: 278. First Bad Version
 */
class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}