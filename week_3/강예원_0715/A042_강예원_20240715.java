package week_3.강예원_0715;

/**
 * 두 문자열이 주어지는데 '#'은 backspace를 의미한다.
 * 두 문자열을 빈 텍스트 편집기에 입력했을 때 최종 결과가 같은지 다른지 판별하는 문제
 */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                result.append(c);
            } else if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }
        return result.toString();
    }

}