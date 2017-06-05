import java.io.*;
import java.util.*;
class Vowel
{
	public static void main(String args[])
	{
	
	 Scanner scan=new Scanner(System.in);
	 char inp=scan.next().charAt(0);
	 if((inp=='a')||(inp=='e')||(inp=='i')||(inp=='o')||(inp=='u'))
	 {
	 System.out.println("vowel");
	 }
         else
         {
             System.out.println("consonants");
         }
	}
}
