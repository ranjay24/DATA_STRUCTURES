import java.util.Scanner;

public class EX_11Besttimetobuystock {

    public static void maxprofit(int arr[]){
        int minbuy = arr[0];
        int crprofit = 0;
        int maxprofit =Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (minbuy>arr[i]) {
                minbuy = arr[i];
            }
            crprofit = arr[i] - minbuy;
            if(maxprofit<crprofit){
                maxprofit = crprofit;
            }
        }
        System.out.println(maxprofit);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int price[] = new int[n];
        for (int i = 0; i < price.length; i++) {
            price[i] = in.nextInt();
        }
        maxprofit(price);in.close();
    }
}
