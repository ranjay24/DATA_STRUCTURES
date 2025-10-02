import java.util.Scanner;

public class EX_14PrintSpiralmatrix {

    public static void printspiral(int arr[][]){
    int n = arr.length;
    int rs = 0,re = n-1,cs = 0,ce = n-1;
    while (rs<=re&&cs<=ce) {
        //printing the top row
        for (int i = cs; i <=ce; i++) {
            System.out.print(arr[rs][i]+" ");
        }
        //printing the right row
        for (int i = rs+1; i<=re; i++) {
            System.out.print(arr[i][ce]+" ");
        }
        //printing the bottom row
       if(rs<re){
        for (int i = ce-1; i>=cs; i--) {
            // if (cs == ce) {
            //     return;
            // }
            System.out.print(arr[re][i]+" ");
        }
       }
        //printing the left row
        if(cs<ce){
            for (int i = re-1; i >=rs+1; i--) {
                System.out.print(arr[i][cs]+" ");
            }
        }
        rs++;re--;cs++;ce--;
    }
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int mat[][] = new int[row][col];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        printspiral(mat);in.close();
    }
}
