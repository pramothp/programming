package logic;
import java.util.Scanner;
public class Setbits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String str1=Integer.toBinaryString(a);
		System.out.println(str1);
        if(str1.indexOf("1")<str1.indexOf("0"))
        { 
        	System.out.println("NO");
        }
        else 
        {
        	System.out.println("YES");
        }
	}}


