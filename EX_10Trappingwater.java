import java.util.Scanner;

public class EX_10Trappingwater {
        
    public static void Maxwater(int arr[]){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int leftmax = arr[0];
        //created the left max rod array
        for (int i = 0; i < left.length; i++) {
            left[i] = Math.max(leftmax,arr[i]);
            if(arr[i]>leftmax){
                leftmax = arr[i];
            }
        }

        int rightmax = arr[arr.length-1];
    //created the right mox rod arrya
         for (int i= arr.length-1; i>=0; i--) {
            right[i] = Math.max(rightmax, arr[i]);
            if (arr[i]>rightmax) {
                rightmax = arr[i];
            }
         }

         // calculating the trapped water 
           
        int totalwater = 0;
        for (int i = 0; i < right.length; i++) {
         totalwater = totalwater+ (Math.min(left[i], right[i]))-arr[i];
        }
        System.out.println(totalwater);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for (int i = 0; i < height.length; i++) {
            height[i] = in.nextInt();
        }
        Maxwater(height);in.close();
    }
}
