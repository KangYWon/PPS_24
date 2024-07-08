// 0703(수)
// A009 문자열 다루기 기본

class A009 {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    answer = false;
                }
            }

        } else {
            answer = false;
        }
        return answer;
    }
}