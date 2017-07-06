package hunter;
import java.util.Scanner;
public class IndexDiffrence {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b=0;
		int large=-999999999;
        for(int i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {   
        	int j=i+1;
        	if(Math.abs(a[i]-a[j])>large)
        	{
        		large=Math.abs(a[i]-a[j]);
        		b=i;
        		
        	}
        }
        System.out.println("the largest diffrence of index is"+b);
        s.close();
	}

}
