package week_3.강예원_0716;

/**
 * String을 입력 받아 그 String이 그룹 단어(문제에 조건이 주어짐)인지 아닌지
 * 판별하여 그룹단어인 String의 개수를 출력하는 문제이다.
 */
import java.util.Scanner;

public class A048_강예원_20240716 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.nextLine(); // 개행 문자 소비

        int groupWordCount = 0;

        for (int i = 0; i < num; i++) {
            String word = s.nextLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
        s.close();
    }

    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char previousChar = word.charAt(0);
        seen[previousChar - 'a'] = true;

        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar != previousChar) {
                if (seen[currentChar - 'a']) {
                    return false;
                }
                seen[currentChar - 'a'] = true;
                previousChar = currentChar;
            }
        }
        return true;
    }
}