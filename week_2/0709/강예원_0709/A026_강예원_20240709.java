package week_2.강예원_0709;

/**
 * 양의 정수 x의 각 자리수의 합으로 x가 나누어졌을 때 나머지가 0인지 아닌지 판별하는 문제이다.
 */

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int original = x;

        // 자릿수 합산하기
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        if (original % sum != 0)
            answer = false;

        return answer;
    }
}