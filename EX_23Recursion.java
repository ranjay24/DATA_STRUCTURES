import java.util.Scanner;

public class EX_23Recursion {
    public static void inprint(int n){
        if(n==1){
            System.out.println(n+" ");
            return ;
        }
        inprint(n-1);
        System.out.println(n+" ");

    }
    public static void decprint(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        System.out.println(n+" ");
        decprint(n-1);
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        // int fm_1 = fact(n-1);
        int ans = n * fact(n-1);
        return ans;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int ans = n + sum(n-1);
        return ans;
    }

    public static int fibo(int n){
       if (n==0||n==1) {
        return n;
       }
        int a =  fibo(n-1);
        int b = fibo(n-2);
        int ans = a+b;
        return ans;
    }

    public static boolean issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<=arr[i+1]){
            return issorted(arr, i+1);
        }
        return false;
    }

    public static int  find(int arr[], int i,int key){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length){
            return -1;
        }
        return find(arr, i+1, key);
        
    }
public static int exponential(int x, int n){
    if(n==1){
        return x;
    }
    return x * exponential(x, n-1);
}    

public static int optimiexpo(int x, int n){
    if(n==0){
        return 1;
    }
   int halfpower  = optimiexpo(x, n/2);
   int halfpowersq = halfpower*halfpower;
   if(n%2!=0){
    halfpower = x*halfpower;
   }
    return halfpowersq;
}    


public static int tilingproblem(int n){
    if (n==0||n==1) {
        return 1;
    }
    int vertical = tilingproblem(n-1);
    int horizontal = tilingproblem(n-2);
    int total = vertical+horizontal;
    return total;
}

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // int Num = in.nextInt();
        // System.out.println(fibo(Num));
        // int arr[]  = {2,4,5,5,6,1};
        // int i=0;
        // int key =  1;
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println(optimiexpo(x, n));in.close();
    }
}
