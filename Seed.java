import java.util.Scanner;

public class Seed {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i,j=0;
        int p=a,op=p;
        while(a>0)
        {
            a=a/10;
            j+=1;
            
        }
        int[] sp=new int[j];
        for(i=0;i<j;i++)
        {
            while(p>0)
            {
                sp[i]=p%10;
                p=p/10;
                i++;
            }
        }
        for(i=0;i<j;i++)
        {
        op=op*sp[i];
        }   
        System.out.println(op);
     
    }
    
}
