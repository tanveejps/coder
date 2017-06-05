import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int a;
    a=scan.nextInt();
    if(a>0)
    {
      System.out.println("positive");
    }
    else if(a<0)
    {
      System.out.println("negative");
    }
    else if(a==0)
    {
      System.out.println("zero");
    }
  }
}
