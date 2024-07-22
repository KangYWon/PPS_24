package week_3.강예원_0717;
//입력받은 카이사르 단어를 원래 단어로 고쳐서 출력한다.

import java.util.Scanner;

public class A050_강예원_20240717 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String encrypted = s.nextLine();
        String decrypted = decryptCaesarCipher(encrypted);
        System.out.println(decrypted);
        s.close();
    }

    private static String decryptCaesarCipher(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encrypted.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // A의 아스키 값은 65, Z의 값은 90
                char shifted = (char) (c - 3);
                if (shifted < 'A') {
                    shifted += 26;
                }
                decrypted.append(shifted);
            } else {
                // 대문자 알파벳이 아닌 문자
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}