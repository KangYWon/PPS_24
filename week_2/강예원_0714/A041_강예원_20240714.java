package week_2.강예원_0714;

//문자열을 JadenCase(모든 단어의 첫 문자가 대문자이고, 그 외는 소문자인 문자열)로 바꾸는 문제.

class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                capitalize = true;
            } else {
                if (capitalize) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                capitalize = false;
            }
        }

        return result.toString();
    }
}