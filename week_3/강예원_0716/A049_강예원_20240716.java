package week_3.강예원_0716;
//문자열을 입력 받고 주어진 조건에 맞는 비밀번호인지 아닌지를 판별하는 문제

import java.util.Scanner;

public class A049_강예원_20240716 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String vowels = "aeiou";

        while (true) {
            String password = s.nextLine();

            if (password.equals("end")) {
                break;
            }

            if (isAcceptable(password, vowels)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }
        s.close();
    }

    // 패스워드 검증 함수
    public static boolean isAcceptable(String password, String vowels) {
        boolean hasVowel = false;
        int vowelStreak = 0, consonantStreak = 0;
        char prevChar = '\0';

        for (char currentChar : password.toCharArray()) {
            if (vowels.indexOf(currentChar) != -1) {
                hasVowel = true;
                vowelStreak++;
                consonantStreak = 0;
            } else {
                vowelStreak = 0;
                consonantStreak++;
            }

            if (vowelStreak >= 3 || consonantStreak >= 3) {
                return false;
            }

            if (prevChar == currentChar && currentChar != 'e' && currentChar != 'o') {
                return false;
            }

            prevChar = currentChar;
        }

        return hasVowel;
    }
}
