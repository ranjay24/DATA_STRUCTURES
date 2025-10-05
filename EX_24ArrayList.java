import java.util.ArrayList;
import java.util.Collections;
public class EX_24ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Basic operation on ArrayList are add, remove, get, set, contains
       list.add(21); 
       list.add(2221); 
       System.out.println(list);
    //    get method
       System.out.println(list.get(1));
    //    remove method
       System.out.println(list.remove(0));
    //    set method
       System.out.println(list.set(0, 555));
       System.out.println(list);
    //    check element is a part or not 
       System.out.println(list.contains(555));
    //    to check length
       System.out.println(list.size());


    // to print reverse of a list
    list.add(10);
    list.add(11);
    list.add(12);
    list.add(13);

    for (int i = list.size()-1; i>=0; i--) {
        System.out.println(list.get(i));
    }

    // to print maximum of list 
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < list.size(); i++) {
        max  =  (max>list.get(i))?max:list.get(i);
    }
    System.out.println(max);

    // sorting an ArrayList   Collections.sort(list);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list, Collections.reverseOrder());

    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> arr =  new ArrayList<>();
    arr.add(23);arr.add(323);
    mainList.add(arr);
    ArrayList<Integer> arr1 =  new ArrayList<>();
    arr1.add(23);arr1.add(323);
    mainList.add(arr1);
    System.out.println(mainList.size());
    for (int i = 0; i < mainList.size() ; i++) {
        ArrayList<Integer> currlist = mainList.get(i);
        for (int j = 0; j < currlist.size(); j++) {
            System.out.print(currlist.get(j)+" ");
        }
        System.out.println();
    }
    }
}
