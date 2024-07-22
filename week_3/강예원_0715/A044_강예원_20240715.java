package week_3.강예원_0715;

/**
 * 학생들의 출결 사항을 문자로 표현하여 최종 출결 사항을 하나의 문자열로 주어진다.
 * 문제에 주어진 조건에 맞게 출결을 체크하는 함수를 작성한다.
 */

class Solution {
    public boolean checkRecord(String s) {
        int absences = 0;
        int consecutiveLates = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'A') {
                absences++;
                if (absences >= 2) {
                    return false;
                }
                consecutiveLates = 0; // 결석일 때 연속 지각 수 초기화
            } else if (c == 'L') {
                consecutiveLates++;
                if (consecutiveLates >= 3) {
                    return false;
                }
            } else {
                consecutiveLates = 0; // 지각이 아닌 경우 연속 지각 수 초기화
            }
        }

        return true;
    }
}
