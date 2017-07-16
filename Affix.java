package hunter;
import java.util.Scanner;
public class Affix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int count=0;
		
		for(int i=str.length()-1;i>=0;i--)
		{ 
			StringBuffer sb=new StringBuffer(str);
		    StringBuffer sb1=new StringBuffer(str);
		    if(sb.substring(0,sb.length()/2).toString().equals(sb.substring(sb.length()/2,sb.length())))
		    {
		    	System.out.println("Double");
		    	break;
		    }
		    else
			{
				sb=new StringBuffer("");
				sb1=new StringBuffer("");
				sb=new StringBuffer(str);
			    sb1=new StringBuffer(str);	
			}
		    
			sb.deleteCharAt(i);
		    sb1.deleteCharAt(i);
		     if((sb.substring(0,sb.length()/2).toString()).equals(sb1.substring(sb.length()/2,sb.length())))
			{
			   System.out.println("Double");
			   break;
		    }
			else
			{  count++;
				sb=new StringBuffer("");
				sb1=new StringBuffer("");
			}
	  }
		if(count==str.length())
		{
			System.out.println("Not Double");
		}
		s.close();
	}
}
