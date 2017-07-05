package hunter;
import java.util.Scanner;
public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem=0;
		int sum=0;
		while(n!=0){
			rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
        String str=String.valueOf(sum);
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        if(str.equals((sb).toString())){
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("not palindrome");
        }
        s.close();
	}

}
