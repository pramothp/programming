package hunter;

import java.util.Scanner;

public class StrPalindrome {

	public static void main(String[] args) {
     Scanner s=new Scanner (System.in);		
     String str=s.next();
          
     for(int i=1;i<str.length();i++)
     {    StringBuffer sb=new StringBuffer(str);
          StringBuffer sb1=new StringBuffer(str);

    	 if((sb.deleteCharAt(str.length()-i).toString()).equals(sb1.deleteCharAt(str.length()-i).reverse().toString()))
    	 {
    		 System.out.println(sb);
    		 break;
    	 }
    	 else{
    		 
    		 sb=new StringBuffer("");
    	     sb1=new StringBuffer("");
     }

	}

}
}