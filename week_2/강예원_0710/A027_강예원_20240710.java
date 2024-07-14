package week_2.강예원_0710;
//어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하는 문제

//Stack 사용해서 구현. StringBuilder 사용. 

import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int length = number.length();

        for (int i = 0; i < length; i++) {
            char currentChar = number.charAt(i);

            // 스택에서 제거 조건
            while (!stack.isEmpty() && stack.peek() < currentChar && k > 0) {
                stack.pop();
                k--;
            }
            // 스택에 현재 문자를 추가
            stack.push(currentChar);
        }

        // 제거해야할 k, 스택에서 제거
        while (k > 0) {
            stack.pop();
            k--;
        }

        // 문자열 변환
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
