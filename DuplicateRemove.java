package hunter;
import java.util.Scanner ;
public class DuplicateRemove {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	String str=s.next();
	if(str.equals("Sunday"))
	{
		System.out.println("False");
	}
	else if(str.equals("Monday")||str.equals("Tuesday")||str.equals("Wednesday")||str.equals("Thursday")||str.equals("Friday")||str.equals("Saturday")){
		System.out.println("True");
	}
	else if(str.equals("monday")||str.equals("tuesday")||str.equals("wednesday")||str.equals("thursday")||str.equals("friday")||str.equals("saturday")){
		System.out.println("True");
	}
	else if(str.equals("mon")||str.equals("tue")||str.equals("wed")||str.equals("thu")||str.equals("fri")||str.equals("sat")){
		System.out.println("True");
	}
	else if(str.equals("Mon")||str.equals("Tue")||str.equals("Wed")||str.equals("Thu")||str.equals("Fri")||str.equals("Sat")){
		System.out.println("True");
	}
	}

}
