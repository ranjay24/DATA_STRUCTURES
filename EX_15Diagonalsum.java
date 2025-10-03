import java.util.Scanner;

public class EX_15Diagonalsum {
  
    public static void diagonalsum(int mat[][]){
        int pridiagonal = 0;
        int secdiagonal = 0;
        int i=0,j=0;
        while (i<mat.length&&j<mat.length) {
            pridiagonal = pridiagonal+mat[i][j];
            i++;j++;
        }
        j=mat.length-1;i=0;
        while (i<mat.length&&j<mat.length) {
           secdiagonal = secdiagonal +mat[i][j];
           i++;j--;
        }
        int alt = (mat.length)/2;
        int ans = (mat.length%2==0) ? (pridiagonal+secdiagonal): (pridiagonal+secdiagonal)-mat[alt][alt]; 
        System.out.println(ans);
    }
 

     //approach 2 
     public static void diasum2(int mat[][]){
        int sum = 0;
      for (int i = 0; i < mat.length; i++) {
        sum +=mat[i][i];
        if (i!=mat.length-1-i) {
            sum+=mat[i][mat.length-1-i];
        }
      }
      System.out.println(sum);
     }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int mat[][] = new int[row][col];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        // diagonalsum(mat);
        diasum2(mat);
in.close();
    }
}
