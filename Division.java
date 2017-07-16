package hunter;
import java.util.* ;
public class Division {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Enter the number1");
	int n=s.nextInt();
	System.out.println("enter the number2");
	int m=s.nextInt();
	int diff=0;
	int count=0;
	while(n>=m)
	{ 
		n=n-m;
		count++;
	}
     System.out.println("the number1 divisible by number2 :quotient is"+count);
     System.out.println("the number1 divisible by number2 :remainder is"+n);
	}

}
