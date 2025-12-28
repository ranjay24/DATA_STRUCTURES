import java.util.Scanner;

public class EX_16Staircasesearch {
    public static void search(int mat[][],int key){
        int i = 0;
        int j = mat.length-1;
        while (j>=0&&i<mat.length) {
            if(key>mat[i][j]){
                i++;
            }
            else if(key<mat[i][j]){
                j--;
            }
            else if(key==mat[i][j]){
                System.out.println(i+ " " + j);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int row =in.nextInt();
        int col = in.nextInt();
        int mat[][] = new int[row][col];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        int key = in.nextInt();
    search(mat, key);in.close();
    }
}
