package week_2.강예원_0712;

import java.util.HashSet;
import java.util.Scanner;

public class A034_강예원_20240712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int number = s.nextInt();
            int remainder = number % 42;
            remainders.add(remainder);
        }

        System.out.println(remainders.size());
    }
}
