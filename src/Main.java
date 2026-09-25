// Заглушка для локальной работы и компиляции в IntelliJ IDEA
class VersionControl {
    // В LeetCode этот метод реализован на стороне платформы
    boolean isBadVersion(int version) {
        return false;
    }
}

/*
 * Решение для LeetCode: 278. First Bad Version
 * Класс Solution наследует VersionControl и использует API isBadVersion.
 */
public class Solution extends VersionControl {
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