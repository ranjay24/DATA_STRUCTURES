import java.util.Scanner;

public class EX_20Firstlettouppercase {

    public static String toupperecase(String str){
    StringBuilder sb = new StringBuilder("");
    // String sb = "";
    char ch;
    for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i)==' '){
            sb.append(str.charAt(i));
        }
        else if(str.charAt(i)!=' '){
            if(i==0){
                ch =  Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else if(i>0&&str.charAt(i-1)==' '){
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
    }
        String ans = sb.toString();
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(toupperecase(str));
        System.out.println(str);    //THIS LINE IMPLIES THAT STRING IN JAVA ARE IMMUTABLE
in.close();
    }
}
