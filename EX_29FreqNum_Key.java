import java.util.ArrayList;
import java.util.Scanner;

public class EX_29FreqNum_Key {
    
    public void mostFreqNum(ArrayList<Integer> list , int key){
        int currfreq = 0, maxfreq= 0;
        for(int i  = 0 ;i<list.size();i++){
            int target = list.get(i);
            for(int j = 0;j<list.size()-1;j++){
            if(list.get(j)==key && list.get(j+1)==target){
                currfreq++;
                maxfreq  = Math.max(maxfreq, currfreq);
            }
            }
        }
        System.out.println(maxfreq);
    }


    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int  i = 0; i < list.size()-1; i++) {
            int val = in.nextInt();
            list.add(val);
        }
        // int key = in.nextInt();
        in.close();
    }
}
