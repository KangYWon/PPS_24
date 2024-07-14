package week_2.강예원_0713;
//정수 x가 주어진 경우 x의 제곱근을 계산하여 반환하는 문제

class Solution {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;

        int left = 1, right = x, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}