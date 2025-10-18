import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EX_28LonelyArrayList {

    public static void lonelyList(ArrayList<Integer> list){
        ArrayList<Integer> ans  = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
        int val  = list.get(i);
        if( (Collections.frequency(list, val)==1) && !list.contains(val-1) && !list.contains(val+1)){
     ans.add(val);
        }

        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size);
        for(int i = 0;i<size;i++){
            int val = in.nextInt();
            list.add(val);
        }
        lonelyList(list);
in.close();
    }
}
