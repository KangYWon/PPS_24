package week_3.강예원_0716;
//입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다.

import java.util.Scanner;

public class A047_강예원_20240716 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word = s.nextLine();
        int length = word.length();

        for (int i = 0; i < length; i += 10) {
            if (i + 10 < length) {
                System.out.println(word.substring(i, i + 10));
            } else {
                System.out.println(word.substring(i));
            }
        }
    }
}
