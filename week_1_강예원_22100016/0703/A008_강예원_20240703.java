
// 0703(수)
// A008 평균은 넘겠지
import java.util.Scanner;

public class A008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 테스트 개수 입력
        int test = s.nextInt();

        // 각 테스트 처리하기
        for (int i = 0; i < test; i++) {
            int studentNum = s.nextInt();
            int[] scores = new int[studentNum];
            int sum = 0;

            for (int j = 0; j < studentNum; j++) {
                scores[j] = s.nextInt();
                sum += scores[j];
            }

            // 평균계산
            double average = (double) sum / studentNum;

            // 평균 넘는 학생 수
            int count = 0;
            for (int score : scores) {
                if (score > average)
                    count++;
            }
            double percentage = (double) count / studentNum * 100;

            // 결과 출력
            System.out.printf("%.3f%%\n", percentage);
        }

    }
}