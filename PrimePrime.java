package hunter;
import java.util.Scanner;
public class PrimePrime {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int rem=0;
		int sum=0;
		int count1=0;
		int count2=0;
		int b=0;
		for(int i=n;i>=m;i--)
		{
			    b=i;
			    sum=0;
				  while(b!=0)
				 {
					 rem=b%10;
					 b=b/10;
				     sum=sum+rem;
				 }
				
				  count1=0;
				
				for(int k=2;k<=sum;k++)
				{
				   if(sum%k==0)
				   {
					 count1++;
				   }
				}
                 
				if(count1==1)
				{
					count2++;
				}
			}
				
	
		System.out.println(count2);
    s.close();
	}

    }
