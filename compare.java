import java.util.*;
public class compare {
    public static void main(String[] args) {
        System.out.println("Comparing strings.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        System.out.println("Enter another string:");
        String b=sc.nextLine();
        int w=a.compareTo(b);
        System.out.println(w);
        sc.close();
        
        
    }
    
}
