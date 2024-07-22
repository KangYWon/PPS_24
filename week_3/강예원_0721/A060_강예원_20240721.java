package week_3.강예원_0721;
//주어진 배열의 값들을 연산하여 결과를 내는 문제. 단 특수한 연산을 해야하는 값이 존재한다.

import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "+":
                    // 이전 두 점수의 합을 스택에 추가
                    int top = stack.pop();
                    int newTop = top + stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                    break;
                case "D":
                    // 이전 점수의 두 배를 스택에 추가
                    stack.push(2 * stack.peek());
                    break;
                case "C":
                    // 이전 점수를 무효화하고 스택에서 제거
                    stack.pop();
                    break;
                default:
                    // 새로운 점수를 스택에 추가
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}