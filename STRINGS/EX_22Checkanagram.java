import java.util.Scanner;

public class EX_22Checkanagram {

    public static boolean anagram(String s, String s1){
        String test = s;
        for (int i = 0; i < test.length(); i++) {
            if(s.equals(s1)){
                return true;
            }
            char ch = test.charAt(i);
            s = s.replace(ch,' ');
            s1 = s1.replace(ch,' ');
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(anagram(str1, str2));in.close();
    }
}
