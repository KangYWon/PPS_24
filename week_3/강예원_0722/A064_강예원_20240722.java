package week_4.강예원_0722;
//heights[i] != expected[i]인 인덱스의 수를 반환

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // 현재 키 배열의 복사본을 만들어 정렬하기
        int[] expected = heights.clone();
        Arrays.sort(expected);

        int count = 0;
        // 현재 배열과 정렬된 배열을 비교, 일치하지 않는 인덱스 개수 카운트
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}