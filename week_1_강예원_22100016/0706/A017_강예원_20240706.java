//방 번호

import java.util.Scanner;

public class A017 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 방 번호 입력
        String roomNum = s.next();
        // 숫자 빈도 저장 배열
        int[] count = new int[10];
        for (char c : roomNum.toCharArray()) {
            count[c - '0']++;
        }
        // 6,9부분
        int sixNine = count[6] + count[9];
        count[6] = (sixNine + 1) / 2; // 6,9빈도 처리
        count[9] = 0; // 중복 방지

        int result = 0;
        for (int num : count) {
            result = Math.max(result, num);
        }
        System.out.println(result);
    }
}