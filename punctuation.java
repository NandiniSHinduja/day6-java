import java.util.*;
public class punctuation {
    public static void main(String[] args) {
        System.out.println("Punctuations");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int counter=0;
        for(int i=0;i<a.length();i++){
            char ch=getCharFromString(a,i);
            String s=String.valueOf(ch);
            if(s.equals(",")){
                counter++;
            }
            else if(s.equals("'")){
                counter++;
            }
            else if(s.equals(":")){
                counter++;
            }
            else if(s.equals(";")){
                counter++;
            }
            else if(s.equals(".")){
                counter++;
            }
            else if(s.equals("?")){
                counter++;
            }
            else if(s.equals("!")){
                counter++;
            }
        
        }
        System.out.println("The number of punctuations in the given string are " +counter);
        sc.close();
        
    }
    private static char getCharFromString(String a, int i){
        return a.charAt(i);
    }
    
}
