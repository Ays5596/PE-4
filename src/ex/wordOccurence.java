package ex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wordOccurence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to find word:");
        String str = input.nextLine();
        System.out.println("Enter word:");
        String word = input.nextLine();
        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(str);
        while(m.find())
            System.out.println("Found at: "+m.start()+" - "+m.end());

    }
}
