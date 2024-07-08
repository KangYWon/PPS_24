//문자열 압축
class A010 {
    public int solution(String s) {
        int length = s.length();
        int answer = length;

        // s의절반까지 압축
        for (int step = 1; step <= length / 2; step++) {
            String compressed = "";
            String prev = s.substring(0, step);
            int count = 1;

            // 문자열을 잘라서 비교
            for (int j = step; j < length; j += step) {
                String sub;
                if (j + step > length) {
                    sub = s.substring(j);
                } else {
                    sub = s.substring(j, j + step);
                }

                if (prev.equals(sub)) {
                    count++;
                } else {
                    compressed += (count > 1 ? count : "") + prev;
                    prev = sub;
                    count = 1;
                }
            }

            compressed += (count > 1 ? count : "") + prev;

            // 가장 짧은 압축 문자열의 길이
            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}