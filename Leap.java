import java.util.*;


public class Leap {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if(year%4==0)
        
            System.out.println("Leap Year");
        else if( year%100==0 && year%400==0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a leap Year");
            
        
    
    }
