package brocode;

public class methodoverloading {

	public static void main(String[] args) {
	
		int x=add(22,33,44);
		System.out.println(x);
		
	}

	static int add(int a,int b) {
		
		System.out.println("This is method overloading 1..");
		return a+b;
		
	}
	static int add(int a ,int b,int c) {
		
		System.out.println("This is method overloading 2..");
		return a+b+c;
	}
	static int add(int a , int b ,int c , int d ) {
		
		System.out.println("This is method overloading 3..");
		return a+b+c+d;
	}
	static int add(int a ,int b ,int c , int d ,int e) {
		System.out.println("This is method overloading 4 ...");
		return a+b+c+d+e;
	}
	
	
}

