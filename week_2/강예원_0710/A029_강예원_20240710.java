package week_2.강예원_0710;
//문을 규칙에 맞는 방법으로 열어야하도록 시스템을 구성하였다.  문의 개수를 입력받고 문을 여는 방법을 한줄에 하나씩 출력한다.

import java.util.Scanner;

public class A029_강예원_20240710 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        int door[] = new int[6];

        int zero = s.nextInt();
        door[0] = zero;
        int temp = zero;
        for (int i = 1; i < 5; i++) {
            door[i] = 1 - zero;
            zero = 1 - zero;
        }
        if (num >= 6) {
            System.out.println("Love is open door");
        } else {
            for (int i = 1; i < num; i++) {
                System.out.println(door[i]);
            }
        }
    }

    private static String src = "10\r\n" + "1";
}
