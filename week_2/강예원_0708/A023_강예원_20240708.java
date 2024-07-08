// 정수가 주어지면 결과가 한 자리만 될 때까지 모든 숫자를 반복해서 추가하고 반환하는 문제

class Solution {
    public int addDigits(int num) {
        // num이 한 자리 숫자가 될 때까지
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }

    // 주어진 숫자의 자릿수를 더하는 메소드
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
