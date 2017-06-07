import java.io.*;
import java.util.*;
public class greaat{
    public static void main(String arg[])
    {
        int[] n=new int[3];
        int i;
        Scanner scan=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            n[i]=scan.nextInt();
        }
        Arrays.sort(n);
        System.out.println(n[2]);
        
            
       
    }
