import java.util.*;
public class vowelsconsonants {
    public static void main(String[] args) {
        System.out.println("Vowels and Consonants");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int counter=0;
        int consonant_counter=0;   
        for(int i=0;i<a.length();i++){        
            char ch=getCharFromString(a,i);
            String s=String.valueOf(ch);
            if(Character.isAlphabetic(ch)){
                if(s.equals("a")){
                    counter++;
                }
                else if(s.equals("e")){
                    counter++;
                }
                else if(s.equals("u")){
                    counter++;
                }
                else if(s.equals("i")){
                    counter++;
                }
                else if(s.equals("o")){
                    counter++;
                }
                else if(s.equals(" ")){
                    continue;
                }
                else{
                    consonant_counter++;
                }
            }
            
        }
        System.out.println("The number of vowels in the string is " +counter);
        System.out.println("The number of consonants in the string is " +consonant_counter);
        sc.close();     
    }
    private static char getCharFromString(String a, int i) {
        return a.charAt(i);
    }
}
