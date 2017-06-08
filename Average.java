import java.io.*;
import java.util.*;
import java.lang.*;

public class Average {

    
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the no of array elements: ");
      int size=s.nextInt();
      int sumb=0,aveb,sumc=0,avec;
      System.out.println(" ");      
      int i;
      int[] a=new int[size];
      int[] b=new int[size/2];
      int[] c=new int[(size-b.length)];
      for(i=0;i<size;i++)
      {
          a[i]=s.nextInt();
      }
      System.arraycopy(a,0,b,0,size/2);
      System.arraycopy(a,(size/2),c,0,(size-(size/2)));
      for(i=0;i<b.length;i++)
      {
       sumb=sumb+b[i];
      }
      aveb=sumb/b.length;
      for(i=0;i<c.length;i++)
      {
          sumc=sumc+c[i];
      }
      avec=sumc/c.length;
      String m=Arrays.toString(b);
      String n=Arrays.toString(c);
      if(aveb==avec)
      {
          System.out.println(" "+m+","+n);
          
      }
      else
      System.out.println("Not possible");
    }
    
}
