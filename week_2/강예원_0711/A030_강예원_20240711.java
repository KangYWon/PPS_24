package week_2.강예원_0711;

//N일 뒤의 재현이의 기분이 좋은 날일 확률과 싫은 날일 확률에 1,000을 곱해 소수점 첫째자리에서 반올림한 수를 차례대로 출력한다.
import java.util.Scanner;

public class A030_강예원_20240711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int currentMood = s.nextInt(); // 0: 기분이 좋은 날, 1: 기분이 싫은 날

        double[][] transitionMatrix = new double[2][2];
        transitionMatrix[0][0] = s.nextDouble(); // 기분이 좋은 날 -> 기분이 좋은 날
        transitionMatrix[0][1] = s.nextDouble(); // 기분이 좋은 날 -> 기분이 싫은 날
        transitionMatrix[1][0] = s.nextDouble(); // 기분이 싫은 날 -> 기분이 좋은 날
        transitionMatrix[1][1] = s.nextDouble(); // 기분이 싫은 날 -> 기분이 싫은 날

        // 초기 상태 확률 벡터
        double[] currentState = new double[2];
        if (currentMood == 0) {
            currentState[0] = 1.0; // 기분이 좋은 날 확률
            currentState[1] = 0.0; // 기분이 싫은 날 확률
        } else {
            currentState[0] = 0.0; // 기분이 좋은 날 확률
            currentState[1] = 1.0; // 기분이 싫은 날 확률
        }

        // N일 뒤 상태 계산
        double[] nextState = new double[2];
        for (int day = 0; day < num; day++) {
            nextState[0] = currentState[0] * transitionMatrix[0][0] + currentState[1] * transitionMatrix[1][0];
            nextState[1] = currentState[0] * transitionMatrix[0][1] + currentState[1] * transitionMatrix[1][1];
            currentState[0] = nextState[0];
            currentState[1] = nextState[1];
        }

        int goodDay = (int) Math.round(nextState[0] * 1000);
        int badDay = (int) Math.round(nextState[1] * 1000);

        System.out.println(goodDay);
        System.out.println(badDay);
    }
}
