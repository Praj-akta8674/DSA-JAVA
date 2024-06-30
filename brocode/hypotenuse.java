package brocode;
import java.util.Scanner;
public class hypotenuse {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1st side:");
		x=in.nextDouble();
		
		System.out.println("Enter 2st side:");
		y=in.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		
		System.out.println("hypotenuse is :"+z);
		
		
		}

}
