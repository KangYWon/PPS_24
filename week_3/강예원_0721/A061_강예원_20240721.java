package week_3.강예원_0721;
//정수가 주어졌을 때, 해당 정수 열 번호가 Excel 시트에 나타나는 대로 반환하는 문제. (ex) 701 --> ZY)

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            char currentChar = (char) (remainder + 'A'); // 문자로 변환
            result.insert(0, currentChar); // 결과 문자열 앞에 삽입
            columnNumber /= 26; // 다음 자리로 이동
        }

        return result.toString();
    }
}