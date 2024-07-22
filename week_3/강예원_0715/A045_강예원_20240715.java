package week_3.강예원_0715;

//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성한다.
import java.util.Scanner;

public class A045_강예원_20240715 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().toUpperCase();

        int[] frequency = new int[26];

        // 입력 문자열을 순회하면서 각 알파벳의 빈도를 계산합니다.
        for (char c : input.toCharArray()) {
            frequency[c - 'A']++;
        }

        int maxFreq = 0;
        char maxChar = '?';

        // 빈도 배열을 순회하면서 알파벳을 찾기
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                maxChar = (char) (i + 'A');
            } else if (frequency[i] == maxFreq) {
                maxChar = '?';
            }
        }
        System.out.println(maxChar);
    }
}