import java.util.Scanner;

//검증수
public class A015 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 숫자 입력
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = s.nextInt();
        }

        // 숫자 제곱한 합 계산
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i] * numbers[i];
        }

        // 검증수
        int verification = sum % 10;

        // 출력
        System.out.println(verification);
    }
}