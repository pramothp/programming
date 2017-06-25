package hunter;

import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int count =0;
		if(m>n){
			
	        	System.out.println("a2 is not subset of a1");
	        
		}
		else{
			int x[]=new int [n];
			int y[]=new int [m];
		for(int  i=0;i<n;i++){
			x[i]=s.nextInt();
		}
		for(int  i=0;i<m;i++){
			y[i]=s.nextInt();
		}
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++){
        		if(x[i]==y[j])
        		{
        			count++;
        		}
        	}
        }
        if(count==m){
        	System.out.println("a2 is subset of a1");
        }
        else{
			
        	System.out.println("a2 is not subset of a1");
        
	}
		}
        s.close();
	}

}
