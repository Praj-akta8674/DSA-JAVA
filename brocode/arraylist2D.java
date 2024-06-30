package brocode;

import java.util.ArrayList;


public class arraylist2D {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		

		@SuppressWarnings("rawtypes")
		ArrayList<ArrayList<String>> GroceryList = new ArrayList<ArrayList<String>>();
		
		
		ArrayList<String>GamesList= new ArrayList<String>();
		GamesList.add("Granny");
		GamesList.add("Minecraft");
		GamesList.add("CSGO");
		
		ArrayList<String>DrinkList=new ArrayList<String>();
		DrinkList.add("Pepsi");
		DrinkList.add("CocaCola");
		DrinkList.add("AppyFizz");
		
		ArrayList<String>VegetablesList=new ArrayList<String>();
		VegetablesList.add("Tomatoes");
		VegetablesList.add("CauliFlower");
//		VegetablesList.add("LadyFinger");
		
		GroceryList.add(GamesList);
		GroceryList.add(DrinkList);
		GroceryList.add(VegetablesList);
		
		
		System.out.println(GroceryList.get(2).get(1));
		
		
	}

}
