import java.util.ArrayList;

public class EX_26PairSum {
     public static boolean pairSum(ArrayList<Integer> list, int target){
        int start = 0, end = list.size()-1;

        while (start<=end) {
            int sum = list.get(start)+list.get(end);
            if (sum>target) {
                end--;
            }
            else if (sum<target) {
               start++;
            }
            else{
                return true;
            }
        }
        return false;
     }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        int target = 80;
        System.out.println(pairSum(list,target));
    }
}
