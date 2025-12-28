import java.util.Scanner;

public class EX_19Lexicalcomstring {
    public static void main(String args[]){
        Scanner in =  new Scanner(System.in);
        int size = in.nextInt();
        String arr[] = new String[size];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.next();
        }
        String largest  = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest.compareTo(arr[i])<0) {
                largest = arr[i];
            }
        }
        System.out.println(largest);in.close();
    }
}
