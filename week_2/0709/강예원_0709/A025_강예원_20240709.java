package week_2.강예원_0709;

/**
 * 정수 n이 주어지고, 이 수가 4의 거듭 제곱인지 아닌지 판별하는 문제
 */

class Solution {
    public boolean isPowerOfFour(int n) {
        // 정수 n이 주어졌을 때, n이 4의 거듭제곱인지 판단하기
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;

    }
}