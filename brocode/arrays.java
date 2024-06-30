package brocode;

public class arrays {

//	@SuppressWarnings("unused")
//	public static void main(String[] args) {
//	
//		String[] arr = {"Mustang","Lamborgini Suv","Kia","Nexon"};
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//	
//


@SuppressWarnings("unused")
public static void main(String[] args) {

	String[] IPLTEAMS = new String[4];
	
	IPLTEAMS[0]="Mumbai Indians";
	IPLTEAMS[1]="Chennai Super Kings";
	IPLTEAMS[2]="Kollkata Knight Riders";
	IPLTEAMS[3]="Sunrisers Hyderabad";
	
	for (int i = 0; i < IPLTEAMS.length; i++)
        System.out.println("Element at index " + i
                           + " : " + IPLTEAMS[i]);
}
}




