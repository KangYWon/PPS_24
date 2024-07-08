
//지능형 기차
/**
 * 각 역에서 내린 사람과 탄 사람의 수를 통해 기차 내에 사람이 가장 많을 때의 사람 수를 계산하는 문제.
 * 각 역에서 사람의 변동을 추적하며 최대 사람 수를 갱신하기
 */
import java.util.Scanner;

public class A020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int current = 0;
        int max = 0;

        for (int i = 0; i < 4; i++) {
            int peopleOut = s.nextInt();
            int peopleIn = s.nextInt();

            // 갱신
            current = current - peopleOut + peopleIn;
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}