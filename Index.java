package hunter;

import java.util.Scanner;

public class Index {
	void index(int n,int x[]){
		for(int i=0;i<n;i++){
			if(x[i]==i)
			{
				System.out.println(x[i]+"  equals its index  "+i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x[]=new int [n];
		for(int  i=0;i<n;i++){
			x[i]=s.nextInt();
		}
		Index a=new Index();
		a.index(n,x);
		s.close();

	}

}
