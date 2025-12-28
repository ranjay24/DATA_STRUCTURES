public class Maximum_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
                if (count > max) {
                    max = count;
                }
            }
        }

        return max = (max == Integer.MIN_VALUE) ? 0 : max;
    }

}
