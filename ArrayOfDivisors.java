import java.util.ArrayList;

class Solution {
  public int[] divisors(int n) {

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        list.add(i);
      }
    }
    int[] ans = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      ans[i] = list.get(i);
    }

    return ans;
  }
}
