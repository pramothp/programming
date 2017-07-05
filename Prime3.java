package hunter;
import java.util.Scanner;
public class Prime3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=0;
		int n=s.nextInt();
		int count=0;
		int sum=0;
		for(int i=n;i>=2;i--){
			m=n;
			count=0;
		for(int j=2;j<=i;j++){
			
			if(i%j==0)
			{
				count++;
			}
		}
		System.out.println(count);
		n--;
		
		
    if(count==1){
    	System.out.println(m);
    	if(m%10==3){
    		System.out.println(sum);
    	sum=sum+m;
    }
	}
		}
    System.out.println(sum);
    s.close();
	}
}
