package hunter;
import java.util.*;
public class EncryptJava {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int a=0;
		char c='\0';
	 
		for(int i=0;i<str.length();i++)
	    {   
	 
	       if(i!=str.length()-1)
	       {
			a=(int)str.charAt(i);
		     if(a==97)
		     {
			    c=(char)(122);
			    System.out.print(c);
		     }
	         else
	         {
		        c=(char) (a-1);
		        System.out.print(c);
	         }
		    }
	       else if(i==str.length()-1)
	      {
		      System.out.print(str.charAt(str.length()-1));
	      }
	  }
	  s.close();
	}

}
