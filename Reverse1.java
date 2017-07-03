package Hunter;
import java.util.Scanner;
public class Reverse1 {
 public void change(String str){
	 	  int m= str.indexOf(" ");
	   System.out.println(str.substring(m+1,str.length())+" "+str.substring(0,m));
 }
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		Reverse1 r=new Reverse1();
		r.change(str);

	}

}
