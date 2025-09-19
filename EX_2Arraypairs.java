import java.util.*;

public class EX_2Arraypairs {

      public static void pair(int arr[]){
          for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
          }
      }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        pair(arr);
    }
}
