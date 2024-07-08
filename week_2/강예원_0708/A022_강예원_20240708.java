
//통화 시간 목록이 주어졌을 때, 청구 방식이 다른 두 가지 요금제 중 더 저렴한 요금제를 구하는 문제.
import java.util.Scanner;

public class A022_강예원_20240708 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int callNum = s.nextInt();
        int[] callTimes = new int[callNum]; // 각 통화 시간을 저장할 배열

        for (int i = 0; i < callNum; i++) {
            callTimes[i] = s.nextInt();
        }
        // 변수 세팅
        int yBill = 0;
        int mBill = 0;
        // 요금 계산
        for (int time : callTimes) {
            yBill += (time / 30 + 1) * 10;
            mBill += (time / 60 + 1) * 15;
        }

        // 결과 출력
        if (yBill < mBill) {
            System.out.println("Y " + yBill);
        } else if (yBill > mBill) {
            System.out.println("M " + mBill);
        } else {
            System.out.println("Y M " + yBill);
        }
    }
}