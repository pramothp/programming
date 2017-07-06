package hunter;
import java.util.Scanner;
public class Twos {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
        for(int i=0;i<=n;i++)
        { int a=i;
        	while(a!=0){
        		int rem=a%10;
        		a=a/10;
        		if(rem==2)
        		{
        			count++;
        		}
        	}
        }
   System.out.println(count);
   s.close();
	}

}
