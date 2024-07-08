import java.util.*;

//실패율
class A011 {
    public int[] solution(int N, int[] stages) {
        // 각 스테이지에 도달한 플레이어 수와 클리어하지 못한 플레이어 수를 저장할 배열
        int[] reached = new int[N + 2];

        // 각 스테이지에 도달한 플레이어 수 계산
        for (int stage : stages) {
            reached[stage]++;
        }

        // 실패율을 저장할 리스트
        List<StageFailureRate> failureRates = new ArrayList<>();

        // 도달한 플레이어 수
        int playersReached = stages.length;

        // 각 스테이지에 대해 실패율 계산
        for (int i = 1; i <= N; i++) {
            if (playersReached == 0) {
                failureRates.add(new StageFailureRate(i, 0));
            } else {
                double failureRate = (double) reached[i] / playersReached;
                failureRates.add(new StageFailureRate(i, failureRate));
            }
            playersReached -= reached[i];
        }

        // 실패율을 기준으로 내림차순 정렬 (실패율이 같으면 스테이지 번호 기준 오름차순 정렬)
        Collections.sort(failureRates, (a, b) -> {
            if (b.failureRate == a.failureRate) {
                return Integer.compare(a.stage, b.stage);
            }
            return Double.compare(b.failureRate, a.failureRate);
        });

        // 정렬된 결과를 배열로 변환
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = failureRates.get(i).stage;
        }

        return answer;
    }

    // 실패율을 저장할 클래스
    private static class StageFailureRate {
        int stage;
        double failureRate;

        StageFailureRate(int stage, double failureRate) {
            this.stage = stage;
            this.failureRate = failureRate;
        }
    }
}