// 0708 월요일
// 플러그
/*
 * 하나의 플러그가 있고, N개의 멀티탭이 있다.
 * 각 멀티탭은 몇 개의 플러그로 이루어져 있다고 한다.
 * 최대 몇 대의 컴퓨터를 전원에 연결할 수 있는지 출력하는 문제
 */

import java.util.Scanner;

public class A021_강예원_20240708 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        // 초기값
        int totalPlugs = 1;

        // 멀티탭이 몇 개의 플러그 갖고있는지 값 받기
        for (int i = 0; i < N; i++) {
            int plugs = s.nextInt();
            // 멀티탭 자체가 하나의 플러그를 사용하기때문에 -1
            totalPlugs += plugs - 1;
        }

        System.out.println(totalPlugs);
    }
}