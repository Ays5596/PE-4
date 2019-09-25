package ex;
import java.util.*;
public class repdTof {

    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = input.nextLine();
        String s = str.replace('d','f');
        String st = s.replace('l','t');
        System.out.println(st);
    }
}
