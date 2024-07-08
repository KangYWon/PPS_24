//숫자의 개수

import java.util.Scanner;

public class A019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 입력 받기
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        int result = A * B * C;

        // 문자열로 변환
        String resultString = Integer.toString(result);
        // 숫자 빈도를 저장할 배열
        int[] count = new int[10];

        // 빈도 계산
        for (char c : resultString.toCharArray()) {
            count[c - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}