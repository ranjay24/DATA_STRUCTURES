import java.util.*;

public class EX_9Subarray {

     public static void subarray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                System.out.print("(");
                while (start<=j) {
                    System.out.print(" "+arr[start]+" ");
                    start++;
                }
                System.out.print(")");
                System.out.println();
                start = i;
            }
        }
     }
    
         
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in);
        int n = in.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  in.nextInt();
        } 
        subarray(arr);in.close();
    }
}
