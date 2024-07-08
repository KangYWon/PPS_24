//0703(수)
//A006	문자열 내 p와 y의 개수

class A006 {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;

        // p, y 의 개수 세기
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p') {
                pCount++;
            } else if (ch == 'y') {
                yCount++;
            }
        }

        if (pCount != yCount)
            answer = false;

        return answer;
    }
}