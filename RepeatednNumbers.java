package hunter;

import java.util.Scanner;

public class RepeatednNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x[]=new int [n];
		for(int  i=0;i<n;i++)
		{
			x[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
			if(x[i]==x[j])
			{
				System.out.println(""+x[i]);
			}
		}
		}
		s.close();
	}
}
