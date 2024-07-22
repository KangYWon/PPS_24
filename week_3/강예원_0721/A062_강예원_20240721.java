package week_3.강예원_0721;
//두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 구하는 문제.

class Solution {
    public String solution(int a, int b) {

        String[] days = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] monthDays = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int totalDays = 0;

        for (int i = 1; i < a; i++) {
            totalDays += monthDays[i];
        }

        totalDays += b - 1;

        String answer = days[totalDays % 7];

        return answer;
    }
}
