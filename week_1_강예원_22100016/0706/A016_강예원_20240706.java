//구명보트

import java.util.Arrays;

class Solution {
    // 그리디 방법으로 도전
    public int solution(int[] people, int limit) {
        // 사람들 몸무게 정렬
        Arrays.sort(people);

        int left = 0; // 가벼움
        int right = people.length - 1; // 무거움
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}