package hunter;
import java.util.Scanner;
public class CoPrime {
public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if((a%b!=0)&&(b%a!=0)){
			System.out.println("Coprime");
		}
		else
		{
			System.out.println("Not Coprime");
		}
        s.close();
	}

}
