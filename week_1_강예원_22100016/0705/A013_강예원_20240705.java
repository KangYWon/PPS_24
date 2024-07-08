//Single Number

class A013 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            // XOR 연산
            result ^= num;
        }
        return result;
    }
}