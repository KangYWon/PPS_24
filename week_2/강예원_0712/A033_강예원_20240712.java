package week_2.강예원_0712;

/**
 * 총 다섯 개 줄에 각 참가자가 얻은 네 개의 평가 점수가 공백으로 구분되어 주어진다. 우승자의 번호와 그가 얻은 점수를 출력하는 문제
 * 	1.	각 참가자가 얻은 네 개의 평가 점수를 입력받습니다.
	2.	각 참가자의 점수를 합산합니다.
	3.	가장 높은 점수를 받은 참가자를 찾습니다.
 */
import java.util.Scanner;

public class A033_강예원_20240712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numContestants = 5;
        int numScores = 4;
        int maxScore = 0;
        int winner = 0;

        for (int i = 1; i <= numContestants; i++) {
            int totalScore = 0;
            for (int j = 0; j < numScores; j++) {
                totalScore += s.nextInt();
            }
            if (totalScore > maxScore) {
                maxScore = totalScore;
                winner = i;
            }
        }

        System.out.println(winner + " " + maxScore);
    }
}