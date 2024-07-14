package week_2.강예원_0712;

//문제에 화성 수학식에 대한 설명이 주어진다. 화성 수학식이 입력으로 주어지면 그 계산 값을 출력하는 문제
import java.util.Scanner;

public class A035_강예원_20240712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.nextLine(); // 개행 문자

        for (int i = 0; i < num; i++) {
            String[] input = s.nextLine().split(" ");
            double result = Double.parseDouble(input[0]);

            for (int j = 1; j < input.length; j++) {
                char operation = input[j].charAt(0);
                switch (operation) {
                    case '@':
                        result *= 3;
                        break;
                    case '%':
                        result += 5;
                        break;
                    case '#':
                        result -= 7;
                        break;
                }
            }

            System.out.printf("%.2f%n", result);
        }
    }
}