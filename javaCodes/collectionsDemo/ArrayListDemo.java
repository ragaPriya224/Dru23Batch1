package practiccising.main.collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList foodList = new ArrayList();
		foodList.add("biryani");
		foodList.add("dosa");
		foodList.add("chapathi");
		foodList.add("noodles");
		foodList.add("dosa"); //dup allowed
		foodList.add(null);
		foodList.add(1);
		foodList.add(false);//hetero allowed
		System.out.println(foodList);
		System.out.println(foodList.contains("pizza"));
		foodList.remove("chapathi");
		System.out.println(foodList);
		foodList.remove(2);
		System.out.println(foodList);
		foodList.add(2, "paneer dosa");
		System.out.println(foodList);
		foodList.set(0, "omlette");
		System.out.println(foodList);
		//isempty, get,addAll, containsall, size, sublist
		foodList.remove(Integer.valueOf(1));
		System.out.println(foodList);
	}

}
