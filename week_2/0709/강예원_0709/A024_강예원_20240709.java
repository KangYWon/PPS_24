package week_2.강예원_0709;

/**
 * 정수 배열 청구서가 주어졌을 때, 모든 고객에게 정확한 거스름돈을 제공할 수 있으면 true를 반환하고 그렇지 않으면 false를
 * 반환한다.
 */

class Solution {
    public boolean lemonadeChange(int[] bills) {
        // 정확한 거스름돈 줄 수 있으면 true
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else if (bill == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}