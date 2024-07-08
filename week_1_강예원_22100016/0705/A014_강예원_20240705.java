import java.util.ArrayList;
import java.util.List;
//Summary Ranges

class A014 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        // 배열이 비어 있는 경우
        if (nums.length == 0) {
            return result;
        }

        int start = nums[0];
        int end = nums[0];

        // 배열 순회
        for (int i = 1; i < nums.length; i++) {
            // 연속된 수인지 확인
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                // 연속된 수가 아닌 경우 범위를 결과에 추가
                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end);
                }
                start = nums[i];
                end = nums[i];
            }
        }

        // 마지막 범위 추가
        if (start == end) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + end);
        }
        return result;
    }
}