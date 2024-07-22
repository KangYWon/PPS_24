package week_3.강예원_0718;
//괄호 문자열이 주어질 때, primitive 분해를 하고 가장 바깥쪽 괄호를 제거 하는 문제

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (level > 0) {
                    result.append(c);
                }
                level++;
            } else {
                level--;
                if (level > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
