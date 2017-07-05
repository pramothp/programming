package hunter;
import java.util.Scanner;
public class PowerUnique {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int p=1;
	int sum=0;
	int  x=String.valueOf(m).length();
    int arr[]=new int[10];
    
   
    	while(m!=0)
    	{
    		 for(int i=0;i<x;i++)
    		 {
    		  arr[i]=m%10;
    		  m=m/10;
    		}
        }
       for(int k=0;k<x;k++)
       { 
    	 p=1;
         for(int j=0;j<x;j++)
         {
	     p=p*arr[k];
	     }
         sum=sum+p;
        }
    System.out.println(sum);
    s.close();
	}
}
