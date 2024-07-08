// 0703(수)
// A007 음계 판별하기

import java.util.Scanner;

public class A007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 8개의 숫자 입력받아 배열에 저장하기
        int[] nums = new int[8];
        for (int i = 0; i < 8; i++) {
            nums[i] = s.nextInt();
        }

        String result = "mixed";

        // 0, 7번째 숫자 비교해서 일단 정하기
        if (nums[0] == 1 && nums[7] == 8) {
            result = "ascending";
        } else if (nums[0] == 8 && nums[7] == 1) {
            result = "descending";
        }

        // 내부 수 비교해서 바꾸기
        for (int i = 1; i < 8; i++) {
            if (nums[i] != nums[i - 1] + 1 && result.equals("ascending")) {
                result = "mixed";
                break;
            } else if (nums[i] != nums[i - 1] - 1 && result.equals("descending")) {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);
    }

}