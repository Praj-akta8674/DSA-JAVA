package brocode;

import java.util.Scanner;

public class nestedloops {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
	
	int rows;int columns;String symbol;
	
	Scanner in = new Scanner(System.in);
	System.out.print("Enter no. of rows:");
	rows=in.nextInt();
	
	System.out.print("Enter no. of columns:");
	columns=in.nextInt();
	
	System.out.println("Enter symbol to use:");
	symbol=in.next();
	
	for(int i=1;i<=rows;i++) {
		System.out.println();
	for(int j=1;j<=columns;j++) {
		System.out.print(symbol);
	}
	}

}
}
