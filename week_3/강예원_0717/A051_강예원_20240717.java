package week_3.강예원_0717;
//알파벳을 입력 받고, 그 알파벳으로 전화를 걸 때 걸리는 최소 시간을 구하는 문제. 전화를 걸 때 걸리는 시간이 각 알파벳 별로 다르다. 

import java.util.Scanner;

public class A051_강예원_20240717 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        int totalSeconds = getDialTime(word);
        System.out.println(totalSeconds);
        s.close();
    }

    // 입력된 단어를 구성하는 각 알파벳을 숫자로 변환한 뒤, 해당 숫자를 다이얼로 돌리는 시간 계산
    private static int getDialTime(String word) {
        int totalSeconds = 0;
        for (char c : word.toCharArray()) {
            if (c >= 'A' && c <= 'C') {
                totalSeconds += 3; // 2 + 1
            } else if (c >= 'D' && c <= 'F') {
                totalSeconds += 4; // 3 + 1
            } else if (c >= 'G' && c <= 'I') {
                totalSeconds += 5; // 4 + 1
            } else if (c >= 'J' && c <= 'L') {
                totalSeconds += 6; // 5 + 1
            } else if (c >= 'M' && c <= 'O') {
                totalSeconds += 7; // 6 + 1
            } else if (c >= 'P' && c <= 'S') {
                totalSeconds += 8; // 7 + 1
            } else if (c >= 'T' && c <= 'V') {
                totalSeconds += 9; // 8 + 1
            } else if (c >= 'W' && c <= 'Z') {
                totalSeconds += 10; // 9 + 1
            }
        }
        return totalSeconds;
    }
}