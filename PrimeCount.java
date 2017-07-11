package hunter;
import java.util.*;
public class PrimeCount {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int m=s.nextInt();
		int x=s.nextInt();
		int n=s.nextInt();
		int count=0;
		int count1=0;
		int rem=0;
		int a=0;
		
		for(int i=x;i>=m;i--)
		{   a=i;
			count=0;
			for(int j=2;j<=i;j++)
			{
			if(i%j==0)
			{
				count++;
			}
		}
			if(count==1)
	         {
	       	  while(a!=0)
	       	  {
	       		  rem=a%10;
	       		  a=a/10;
	       		  if(rem==n)
	       		  {
	       			  count1++;
	       		  }
	       	  }
	         }
		}
         System.out.println(count1);
         s.close();
  }

}
