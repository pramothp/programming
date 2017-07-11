package hunter;
import java.util.Scanner; 
public class SumPrime {

	public static void main(String[] args) {		
    
	Scanner s=new Scanner (System.in);
    int n=s.nextInt();
    int x=0;
    int y=0;
    int a[]=new int[]{11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
   
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a.length;j++)
    	{
    		if(n==a[i]+a[j]){
    			x=a[i];
    			y=a[j];
    			
    			 
    		}
    	}
    }
   
    if(x!=0&&y!=0){
    System.out.println(x+","+y);
    }
    s.close();
	}

}
