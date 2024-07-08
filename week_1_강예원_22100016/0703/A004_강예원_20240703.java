//0703(수)
//A004	나누어 떨어지는 숫자 배열

import java.util.Arrays;

class A004 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int num : arr) {
            if (num % divisor == 0)
                count++;
        }

        // divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환
        if (count == 0) {
            return new int[] { -1 };
        }

        int[] answer = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num % divisor == 0) {
                answer[index++] = num;
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}