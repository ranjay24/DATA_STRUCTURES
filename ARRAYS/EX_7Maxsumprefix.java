import java.util.*;

public class  EX_7Maxsumprefix {

     public static void maxsubarray(int arr[]){
        int crsum =0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }
         for (int i = 0; i < arr.length; i++) {
            int start = i;
            crsum = 0;
            for (int j = i; j < arr.length; j++) {
            crsum = start==0? prefix[j] : prefix[j]-prefix[start-1];
                if(crsum>=maxsum){
                 maxsum=crsum;
                }
                crsum = 0;
                start = i;
            }
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