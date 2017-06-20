import java.util.Scanner; 
public class fundamental {
public static void main(String args[]){
	int quantity;
	float cost;
	float totalcost;
	Scanner s=new Scanner(System.in);
	 quantity=s.nextInt();
	 cost=s.nextFloat();
	System.out.println(""+quantity);
	System.out.println(""+cost);
	 totalcost=quantity*cost;
	 System.out.println("Quantity:"+quantity+"Nos."+"\nCost:Rs."+cost+"\nTotalcost:Rs."+totalcost);
}
}
