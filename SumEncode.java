package logic;
import java.util.*;
public class SumEncode {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList();
		ArrayList<Integer>b1=new ArrayList();
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int []a=new int[n];
	
	int sum=0;
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		a1.add(a[i]);
	}
	int m=a.length-1;
	int j=0;
    for(int i=m;i>=0;i--)
    { 
    	if(i==a.length-1)
    	{
    		b1.add(a[i]);
    		
    	}
    	else 
    	{   
    		b1.add(b1.get(j)-a[i]);
    		j++;
    	}
    	
    }
   Collections.reverse(b1);
    System.out.println("The first element of the original array:{"+b1.get(0)+"}");
     for(int x:b1 ){
    	 sum=sum+x;
    }
    System.out.println("The sum of the original array:{"+sum+"}");
    s.close();
	}

}
