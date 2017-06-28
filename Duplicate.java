package hunter;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str=s.next();
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			for(int j=i+1;j<sb.length();j++)
			if(sb.charAt(i)==sb.charAt(j)){
			 sb.deleteCharAt(j);
			}
		}
       System.out.println(sb);
       s.close();
	}

}
