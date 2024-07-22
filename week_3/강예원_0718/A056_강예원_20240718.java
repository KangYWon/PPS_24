package week_3.강예원_0718;

//두 배열 num1,num2가 주어질때 두개의 값이 같아지는 num2의 인덱스를 구하고, nums2[j] 다음으로 큰 요소를 계산하는 문제 
import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            // 스택이 비어있지 않고, 스택의 최상단 요소가 현재 요소보다 작은 경우
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // 스택에 남아있는 요소들 -1로 설정
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        int[] result = new int[nums1.length];
        // nums1의 각 요소에 대해 결과 배열을 채우기
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }
}