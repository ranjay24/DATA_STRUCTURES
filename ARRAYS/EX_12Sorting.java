import java.util.Scanner;

public class EX_12Sorting {

    public static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                     arr[j]  = arr[j+1];
                     arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i]  = temp;
        }
    }

public static void insertion(int arr[]){
    for (int i = 1; i < arr.length; i++) {
        int curr = arr[i];
        int prev = i-1;
        while (prev>=0&&arr[prev]>curr) {
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = curr;
    }
}


    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int nums[] =  new int[n];
        for (int i = 0; i < nums.length; i++) {
             nums[i] = in.nextInt();
        }
        // bubblesort(nums);
        insertion(nums);
        print(nums);
in.close();
    }
}
