import java.util.*;

public class EX_5Function {


    //Write a Java method to compute the averageof three numbers..
    public static void average(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println((a+b+c)/3);
        in.close();
    }


    //palimdrome number in java
    
    public static void palimdrome(int num){
        int temp = num;
        int n =0 ;
        while (num>0) {
            int rem =  num%10;
            n=(n*10)+rem;
            num =  num/10;
        }
        if(temp ==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // average();
        int pal = in.nextInt();
        palimdrome(pal);
in.close();
    }
}
