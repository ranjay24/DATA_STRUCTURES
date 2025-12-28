import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if ((nums[i] + nums[j]) == target) {
          ans[0] = i;
          ans[1] = j;
          return ans;
        }
      }
    }
    return ans;
  }
}


class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target-nums[i];
            if(hash.containsKey(remaining)){
            return new int[]{hash.get(remaining),i};
            }
            hash.put(nums[i],i);
        }
        return new int[]{};
    }
}