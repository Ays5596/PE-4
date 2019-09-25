package ex;
import java.util.*;
public class transpose {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to transpose");
        String str = input.nextLine();
        String[] s = str.split(" ");
        String q = "";
        for(int i=0;i<s.length;i++)
        {   for(int j=s[i].length()-1 ; j>=0 ; j--)
        {
               q = q + s[i].charAt(j);
        }
            s[i] = q;
            q = "";
        }
        for(String i : s) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
