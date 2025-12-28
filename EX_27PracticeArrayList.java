import java.util.ArrayList;
import java.util.Scanner;

public class EX_27PracticeArrayList {

    public static boolean monotonic(ArrayList<Integer> list){
        boolean inc = false, dec = false;
        boolean ans = true;
        for(int i = 0;i<list.size()-1;i++){
            if ((list.get(i))<list.get(i+1)) {
                if(dec==false){
                    inc= true;
                }
                else{
                    ans = false;   
                }
                
            }
            else if(list.get(i)>list.get(i+1)){
                if(inc==false){
                    dec= true;
                }
                else{
                    ans =  false;
                }
            }
            else
            {

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int num= in.nextInt();
            list.add(num);
        }
    System.out.println(monotonic(list));in.close();
    }
}
