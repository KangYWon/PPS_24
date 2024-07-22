package week_3.강예원_0718;
//쿠키 개수가 들어있는 cookie 배열이 있을 때, l~m번까지와 m+1~r까지의 합이 같은 경우 중, 총합이 가장 큰 경우를 구하는 문제.

class Solution {
    public int solution(int[] cookie) {
        int maxSum = 0;
        int n = cookie.length;

        for (int s = 0; s < n - 1; s++) {
            int leftSum = cookie[s];
            int rightSum = cookie[s + 1];
            int l = s;
            int r = s + 1;

            // 두 부분의 합이 같은지 확인하면서 확장합니다.
            while (true) {
                if (leftSum == rightSum) {
                    maxSum = Math.max(maxSum, leftSum);
                }
                // 다음 가능한 이동 결정
                if (l > 0 && leftSum <= rightSum) {
                    l--;
                    leftSum += cookie[l];
                } else if (r < n - 1 && rightSum <= leftSum) {
                    r++;
                    rightSum += cookie[r];
                } else {
                    break;
                }
            }
        }

        return maxSum;
    }
}