package week_4.강예원_0722;

//N개의 좌표가 주어졌을 때, 좌표들을 x좌표가 증가하는 순으로 정렬하는 문제. 이 때, x좌표가 같으면 y좌표가 증가하는 순서로 정렬.
// 람다 표현식으로 사용하여 구현해봄. 
import java.util.*;

public class A065_강예원_20240722 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        Arrays.sort(points, (p1, p2) -> {
            if (p1[0] != p2[0]) {
                return Integer.compare(p1[0], p2[0]);
            } else {
                return Integer.compare(p1[1], p2[1]);
            }
        });

        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }

        scanner.close();
    }
}