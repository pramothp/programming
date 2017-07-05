package hunter;

import java.util.Scanner;

public class SumUnique {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int count=0;
		int n=m;
		int rem1=0;
		int sum=0;
		while(m!=0)
		{
			 rem1=m%10;
			m=m/10;
			count++;
		}
		rem1=0;
		for(int i=0;i<count;i++){
			int b=n;
		
		while(b!=0)
		{
			 rem1=b%10;
			b=b/10;
			sum=sum+rem1;
		}
		 n=n/10;
		}
	System.out.println(sum);
	s.close();
	}

}
