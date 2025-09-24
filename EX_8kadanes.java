import java.util.Scanner;



// if all the numbers of the array are negative the this algo will not work so sort the arry and print the least 
public class EX_8kadanes {

    public static void kadane(int arr[]){
        int max = Integer.MIN_VALUE;
        int cs = 0;
    for (int i = 0; i < arr.length; i++) {
        cs = cs +arr[i];
       if(cs<0){
            cs = 0;
        }
       max = Math.max(max,cs);
    }
    System.out.println(max);
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] =  new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
     kadane(arr);in.close();
    }
}
