package hunter;
import java.util.Scanner;
public class Target {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	int n=s.nextInt();
	int a=s.nextInt();
	int b=0;
	int c=0,d=0;
    int x[]=new int[n];
	for(int i=0;i<n;i++){
		x[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			b=x[i]+x[j];
			if(a==b){
				c=x[i];
				d=x[j];
			}
			}
		}
	System.out.println(c+" "+d);
    s.close();
	}

}
