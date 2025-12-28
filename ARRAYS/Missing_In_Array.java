public class Missing_In_Array {
    public int missingNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                num++;
                i = -1;
            } else {
                if (i == (nums.length - 1)) {
                    return num;
                }
            }
        }
        return -1;
    }

}
