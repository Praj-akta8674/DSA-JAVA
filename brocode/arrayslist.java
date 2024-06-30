package brocode;

import java.util.ArrayList;

public class arrayslist {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	ArrayList<String>food=new ArrayList<String>();

	food.add("Puranpoli");
	food.add("Panipuri");
	food.add("Aaloo chi paane");
	food.add("Paav Bhaji");
	
	
	for(int i=0;i<food.size();i++) {
		
	System.out.println(food.get(i));
	}	
	}
}
