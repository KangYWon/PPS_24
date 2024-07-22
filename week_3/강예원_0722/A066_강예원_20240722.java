package week_4.강예원_0722;
//주어진 수의 각 자리수를 내림차순으로 정렬하는 문제.

import java.util.Arrays;
import java.util.Scanner;

public class A066_강예원_20240722 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String number = s.next();
        char[] digits = number.toCharArray();

        Arrays.sort(digits);

        // 내림차순
        StringBuilder sortedNumber = new StringBuilder(new String(digits));
        sortedNumber.reverse();

        System.out.println(sortedNumber.toString());

        s.close();
    }
}