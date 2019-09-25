package ex;
import java.util.*;
public class para {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your paragraph:");
        String str = input.nextLine();
        String[] s = str.split("\\p{Punct}|\\p{Space}");
        //for(String i : s)
          //  System.out.println(i.trim());
        Set<String> word = new TreeSet<>();
        for(String i : s)
            word.add(i);
        for(String a : word)
            System.out.println(a);
    }
}
