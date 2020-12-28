import java.util.*;
public class string{
    public static void main(String[] args) {
        System.out.println("Converts int to string");
        System.out.println("Enter a number or numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=String.valueOf(a);
        System.out.println("Converted string: " +s);
        System.out.println(10+s);
        sc.close();
    }
}