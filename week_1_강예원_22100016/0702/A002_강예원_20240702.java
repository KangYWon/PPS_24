//0702(화)
//A002	Pascal's Triangle

import java.util.ArrayList;
import java.util.List;

class A002 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // 삼각형 각 줄 순차적으로 생성
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // 각 줄의 첫 번째 요소는 항상 1.
            row.add(1);

            // 이전 줄 값 참고하여 현재 줄 값 구하기
            for (int j = 1; j < i; j++) {
                row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            // 각 줄의 마지막 요소는 항상 1
            if (i > 0) {
                row.add(1);
            }

            triangle.add(row);
        }
        return triangle;
    }
}
