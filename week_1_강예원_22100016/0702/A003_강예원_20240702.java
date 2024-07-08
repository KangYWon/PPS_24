//0702(화)
//A003	Plus One

class A003 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // 마지막 자리 +1
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // 9이상 넘으면
            digits[i] = 0;
        }
        int[] number = new int[n + 1];
        number[0] = 1;
        return number;
    }
}