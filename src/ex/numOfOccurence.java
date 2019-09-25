package ex;
import java.io.IOException;
import java.util.*;
public class numOfOccurence {

    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string for finding no. of occurence:");
        String str = input.nextLine();
        System.out.println("Enter a character you want to count:");
        String c = input.next();
        String s = str.replaceAll(c,"");
        //System.out.println(str);
        //System.out.println(str.length());
        //System.out.println(s);
        //System.out.println(s.length());
        System.out.println(str.length()-s.length());
    }
}
