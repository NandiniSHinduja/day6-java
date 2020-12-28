import java.util.*;
public class replace {
    public static void main(String[] args) {
        System.out.println("Replacing spaces with characters.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            char ch=getCharFromString(a,i);
            String s=String.valueOf(ch);
            if(s.equals(" ")){
                s="u";
            }
            System.out.print(s);
        }
        sc.close();
    }
    private static char getCharFromString(String a, int i) {
        return a.charAt(i);
    }
}
