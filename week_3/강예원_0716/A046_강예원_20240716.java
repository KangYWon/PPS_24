package week_3.강예원_0716;

/**
 * 농구 선수를 선발할 수 있는 경우에는 가능한 성의 첫 글자를 사전순으로 공백없이
 * 모두 출력하고 그렇지 않으면 PREDAJA를 출력하는 문제
 */

import java.util.*;

public class A046_강예원_20240716 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.nextLine();

        // HashMap을 사용해 선수 성 첫 글자와 & 수를 카운트
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            String lastName = s.nextLine();
            char firstChar = lastName.charAt(0);
            map.put(firstChar, map.getOrDefault(firstChar, 0) + 1);
        }

        // 선발할 수 있는 성의 첫 글자를 담을 List
        List<Character> result = new ArrayList<>();

        // Map을 순회하며 5명 이상인 첫 글자를 찾기
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 5) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        // 선발할 수 있는 성의 첫 글자가 없다면 "PREDAJA" 출력
        if (result.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            for (char c : result) {
                System.out.print(c);
            }
        }
    }
}
