import java.util.*;

public class EX_1Star {

    //logic for star pattern
    public static void starpattern(int row){
        int num= 1;
        for (int i = 1; i <= row; i++) {                       
            for (int j = 1; j <=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }        
        }

    //logic for inverted star pattern

    public static void invertedstar(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <=row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }        
        }

    //logic for half pyramid of numbers

    public static void halfpyramid(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }        
        }

        //logic for character patter

        public static void charpattern(int row){
            char ch = 'A';
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }        
            }
          

        //logic for hollow rectangle

        public static void hollowrect(int row,int col){
            for (int i = 1; i <=row; i++) {
                for (int j = 1; j <=col; j++) {
                    if(i==1||i==row){
                        System.out.print("* ");
                    }
                    else if(j==1||j==col){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            }


        // logic for rotated half pyramid 

        public static void rotatedpyra(int row,int col){
            for (int i = 1; i <=row; i++) {
                for (int j = col; j>=1; j--) {
                    if(j<=i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            }

            //logic for inverted pyramid with number pattern

            public static void invertednum(int row,int col){
                for (int i = 0; i <row; i++) {
                    for (int j =1; j<=(col-i); j++) {
                       System.out.print(j);
                    }
                    System.out.println();
                }
                }


    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int row  = in.nextInt();
    int col =  in.nextInt();
    // starpattern(row);
    // invertedstar(row);
    // halfpyramid(row);
    // charpattern(row);
    // hollowrect(row, col);
   // rotatedpyra(row,col);
    // invertednum(row,col);
}
}
