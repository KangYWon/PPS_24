package week_2.강예원_0710;
//크기가 큰 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 문제

//math.BigInteger; 사용.

import java.math.BigInteger;
import java.util.Scanner;

public class A028_강예원_20240710 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        // 문자열을 BigInteger 객체로 변환
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        BigInteger result = A.add(B);

        System.out.println(result.toString());

    }
}