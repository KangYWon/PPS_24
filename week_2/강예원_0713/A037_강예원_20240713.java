package week_2.강예원_0713;

/*
 * 두 정수가 주어졌을 때, 그 범위 안의 자기 분할 숫자를 구하는 문제. 자기 분할 숫자란 포함된 모든 숫자로 나눌 수 있는 수이다.
 */
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private static boolean isSelfDividing(int number) {
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 0 || originalNumber % digit != 0) {
                return false;
            }
            number /= 10;
        }

        return true;
    }
}
