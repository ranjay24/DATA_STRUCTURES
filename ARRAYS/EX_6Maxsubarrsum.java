import java.util.*;

public class EX_6Maxsubarrsum {

     public static void maxsubarray(int arr[]){
        int crsum =0;
        int maxsum=0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            crsum = 0;
            for (int j = i; j < arr.length; j++) {
                System.out.print("(");
                while (start<=j) {
                    // System.out.print(" "+arr[start]+" ");
                    crsum = crsum+arr[start];
                   
                    start++;
                }
                System.out.print(crsum);
                if(crsum>=maxsum){
                 maxsum=crsum;
                }
                crsum = 0;
                System.out.print(")"+" ");
                // System.out.println();
                start = i;
            }
            System.out.println();
        }
        System.out.println(maxsum);
     }
    
         
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in);
        int n = in.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  in.nextInt();
        } 
        maxsubarray(arr);in.close();
    }
}
