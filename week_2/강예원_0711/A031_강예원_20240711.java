package week_2.강예원_0711;

//초콜릿의 크기가 주어졌을 때, 이를 1×1 크기의 초콜릿으로 쪼개기 위한 최소 쪼개기 횟수를 구하는 문제
import java.util.Scanner;

public class A031_강예원_20240711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        // 최소 쪼개기 횟수 계산
        int minCuts = a * b - 1;

        System.out.println(minCuts);
    }
}
