package hunter;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x[]=new int [n];
		int sum1=99999999;
		int sum;
		int a=0;int b=0;
		for(int  i=0;i<n;i++){
			x[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			sum=Math.abs(x[i]+x[j]);
			if(sum<sum1){
				a=x[i];
				b=x[j];
				sum1=sum;
			}
	}
		}
		System.out.println("the two elements are "+a+" & " +b);
		s.close();
		}
}
