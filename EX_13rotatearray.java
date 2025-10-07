import java.util.Scanner;
public class EX_13rotatearray {

    public static int[] rotate(int nums[] , int k){
        int[] ans  = new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
        int newIdx = (i+k)%nums.length;
        ans[newIdx]=nums[i];
       }
    return ans;



    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
       
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int k  =  in.nextInt();
        int[] ans = rotate(nums,k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        in.close();
    }
}
