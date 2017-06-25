package hunter;
import java.util.Scanner;
public class Once {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x[]=new int [n];
		for(int  i=0;i<n;i++){
			x[i]=s.nextInt();
		}
		    for(int i=0;i<n;i++)
		{
			     int count=0;
			for(int j=0;j<n;j++){
			   if(x[i]==x[j])
			  {
				 count++;
			  }
		    }
			   if(count==1)
	          {
                System.out.println(""+x[i]);			 
		      }
		}
		 
         s.close();  
	}

}
