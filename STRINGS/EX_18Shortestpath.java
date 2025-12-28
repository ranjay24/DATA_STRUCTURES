import java.util.Scanner;

public class EX_18Shortestpath {

    public static double shortestpath(String path){
        int x_axis = 0;
        int y_axix = 0;
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if(ch=='N'){
                y_axix++;
            }
            else if(ch=='S'){
                y_axix--;
            }
            else if(ch=='E'){
                x_axis++;
            }
            else{
                x_axis--;
            }

        }
        double x = Math.pow(x_axis,2);
        double y = Math.pow(y_axix,2);
        return Math.sqrt(x+y);
    }
 public static void main(String args[]){
    Scanner in =  new Scanner(System.in);
    String path = in.next();
    double ans = shortestpath(path);
    System.out.println(ans);
in.close();
 }   
}
