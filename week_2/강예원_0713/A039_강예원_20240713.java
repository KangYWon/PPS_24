package week_2.강예원_0713;

//정수가 주어지면 sqrt 함수를 사용하지 않고 정사각형인지 아닌지 판별하는 문제
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1)
            return false;

        long left = 1, right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}