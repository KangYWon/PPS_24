//보물

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        // 배열 A 입력
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }

        // 배열 B 입력
        Integer[] B = new Integer[N];
        for (int i = 0; i < N; i++) {
            B[i] = s.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        // 최소 S 값 계산
        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i] * B[i];
        }

        System.out.println(S);
    }
}