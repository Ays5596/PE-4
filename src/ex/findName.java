package ex;
import java.util.*;
import java.util.regex.*;
public class findName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter statement:");
        String str = input.nextLine();
        Pattern p = Pattern.compile("Harry");
        Matcher m = p.matcher(str);
        boolean b = m.find();
        System.out.println(b);
       System.out.println("Is Harry here ? "+b);
      /*  if(m.find())
            System.out.println("Is Harry here? true");
        else
            System.out.println("Is Harry here? false");
*/
    }
}
