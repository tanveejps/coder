import java.util.*;
public class Least {

    public static void main(String[] args) {
       int a,b,i=0,j,size=0,p,least;
       Scanner r=new Scanner(System.in);
       System.out.print("Enter the Number:");
       a=r.nextInt();
       b=r.nextInt();
       p=a;
       while(a>0)
       {
           a=a/10;
           size=size+1;
       }
       if(b<size)
       {
       int[] s=new int[size];
       while(p>0)
       {
           s[i]=p%10;
           p=p/10;
           i++;        
       }
       Arrays.sort(s);
       for(i=0;i<size-b;i++)
       {
           System.out.print(s[i]);
       }
       }else
       {
           System.out.println("invalid input");
       }
       
      
       
       
       
    }
    
}
