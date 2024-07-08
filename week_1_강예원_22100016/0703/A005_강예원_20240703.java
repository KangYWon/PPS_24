//0703(수)
//A005	스킬트리

class A005 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skillTree : skill_trees) {
            if (isValid(skill, skillTree)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isValid(String skill, String skillTree) {
        int index = 0;

        for (char c : skillTree.toCharArray()) {
            int pos = skill.indexOf(c);

            if (pos == -1) {
                continue; // skill이 선행 스킬 순서에 없는 경우
            }

            if (pos == index) {
                index++; // 올바른 순서
            } else {
                return false;
            }
        }

        return true;
    }
}
