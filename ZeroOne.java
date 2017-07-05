package hunter;
import java.util.Scanner;
public class ZeroOne {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int count=0;
		String[] str=new String[n];
        for(int i=0;i<n;i++)
        {
           str[i]=s.next();
        }
        
        for(int i=0;i<n;i++)
        {
        	if(str[i].length()>2)
        	{
        	int j=0;
        	if((str[i].charAt(j)=='0')&&str[i].charAt(j+1)=='1')
        	{
        		count++;
        	}
        	else if((str[i].charAt(j)=='1')&&str[i].charAt(j+1)=='0')
        	{
        		count++;
        	}
            
        	}
        }
        System.out.println(count);
        s.close();
	}

}
