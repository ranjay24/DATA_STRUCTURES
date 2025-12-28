/**
 * EX_17Strings
 */
import java.util.*;
public class EX_17Strings {

    public static boolean palindrome(String s){
      int start =0;int end = s.length()-1;
      while (start<=end) {
        if(s.charAt(start)==s.charAt(end)){
            start++;
            end--;
        }
        else{
            return false;
        }
      }
      return true;
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String s =  in.next();
        boolean ans = palindrome(s);
        System.out.println(ans);
in.close();
    }
}