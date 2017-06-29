package hunter;
import java.util.Scanner;
public class ContainSubsting {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	String str1=s.next();
	if(str.contains(str1)){
		System.out.println(str.indexOf(str1));
	}
	else{
		System.out.println("1");
	}
	}

}
