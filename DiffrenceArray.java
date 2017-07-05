package hunter;
import java.util.Scanner;
public class DiffrenceArray {

	public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    int m=s.nextInt();
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	arr[i]=s.nextInt();
    }
   for(int i=0;i<n;i++)
   {
	   for(int j=0;j<n;j++)
	   {
		   if(arr[i]-arr[j]==m)
		   {
			   System.out.println("["+arr[i]+","+arr[j]+"]");
		   }
	   }
   }
   s.close();
}

}
