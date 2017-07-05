package hunter;
import java.util.Scanner;
public class PasswordCreate {
	
		public static void main(String args[])
		{

	        Scanner s=new Scanner(System.in);
	        String str=s.next();
	        String str1=s.next();
            int m=str.length();
            int n=str1.length();
        if(m==n)
        {
    	for(int i=0;i<n;i++)
    	{
       	    System.out.print(str.charAt(i));
    	    System.out.print(str1.charAt(i));
        }
        }
    	else if(m<n)
        {
    		for(int i=0;i<m;i++)
        {
    		  System.out.print(str.charAt(i));
        	  System.out.print(str1.charAt(i));
    	}  int e=m;
    		for(int k=1;k<=(n-m);k++){
    		  System.out.print(k);
    		  System.out.print(str1.charAt(e));
    		 e++;
    		}
        }
              else if(m>n){
    		for(int i=0;i<n;i++)
        {   
    		System.out.print(str.charAt(i));
    		System.out.print(str1.charAt(i));
    	}
    		int a=n;
    		for(int k=1;k<=(m-n);k++){
	    		  System.out.print(k);	
	    		 System.out.print(str1.charAt(a));
	    		 a++;
	    		}
    		
        }
    	   
    s.close();	      
		}

	}


