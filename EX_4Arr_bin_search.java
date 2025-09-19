import java.util.*;


public class EX_4Arr_bin_search {

    public static void binary_search(int arr[],int key){
        int start =0;
        int end = arr.length-1;
        while (start<=end) {
            int mid  = (start+end)/2;
            if(arr[mid]==key){
                System.out.println("value found");
                break;
            }
            else if(arr[mid]<key){
                start =  mid +1;
            }
            else{
                end  =  mid -1;
            }
        }  
        System.out.println("Value not found");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[]  = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int search =  in.nextInt();
        binary_search(arr,search);
    }
}