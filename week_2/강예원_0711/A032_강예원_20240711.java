package week_2.강예원_0711;

//주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력한다. 
//단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
import java.util.Scanner;

public class A032_강예원_20240711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();

        for (int i = 0; i < test; i++) {
            int floor = s.nextInt();
            int num = s.nextInt();
            System.out.println(count(floor, num));
        }
    }

    static int count(int floor, int num) {
        if (floor == 0) {
            return num;
        } else if (num == 1) { // 1호의 경우는 모든 층의 사람들 수의 합
            return count(floor - 1, num);
        } else {
            return count(floor, num - 1) + count(floor - 1, num);
        }
    }
}
