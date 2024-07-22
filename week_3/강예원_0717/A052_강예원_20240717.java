package week_3.강예원_0717;
//OX퀴즈의 결과가 String으로 주어졌을 때, 점수를 구하는 프로그램을 작성한다.

import java.util.Scanner;

public class A052_강예원_20240717 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            String result = s.next();
            System.out.println(score(result));
        }

    }

    static int score(String result) {

        int score = 0;
        int consecutive = 0;

        for (char c : result.toCharArray()) {

            if (c == 'O') {
                consecutive++;
                score += consecutive;
            } else {
                consecutive = 0;
            }
        }

        return score;
    }

}
