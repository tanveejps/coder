import java.io.*;
import java.util.*;

public class Chal {

    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        String s=ip.nextLine();
        char a=s.charAt(0);
        if(Character.isLetter(a))
            System.out.println("Alphabet");
        else
            System.out.println("Not an Alphabet");
        
        
        
    }
    
}
