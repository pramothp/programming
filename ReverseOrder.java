package hunter;
public class ReverseOrder {
public static void main(String[] args) {
	    String str="hello world";
        int a=str.indexOf(" ");
        System.out.println(str.substring(a+1,str.length())+" "+str.substring(0,a));
	}
}
