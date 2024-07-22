package week_3.강예원_0718;

/*
 * 인형을 뽑는 라인의 순서인 moves에 따라 board에서 인형을 뽑을 때, 
 * 인형이 연속으로 2개 있으면 터진다. 터져서 사라진 인형의 갯수를 구하는 문제.
 */
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            int column = move - 1;
            for (int i = 0; i < board.length; i++) {
                if (board[i][column] != 0) {
                    int doll = board[i][column];
                    board[i][column] = 0;
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}