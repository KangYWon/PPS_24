package week_2.강예원_0714;

//대소문자가 구분된 문자열을 반으로 나누었을 때, 양쪽의 모음 수가 같은 지 구하는 문제.
import java.util.HashSet;

class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int half = n / 2;
        String a = s.substring(0, half);
        String b = s.substring(half);

        return countVowels(a) == countVowels(b);
    }

    private static int countVowels(String str) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int count = 0;
        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
