package practiccising.main.collectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList foodList = new LinkedList();
		foodList.add("biryani");
		foodList.add("dosa");
		foodList.add("dosa"); //dup allowed
		foodList.add(null);
		foodList.add(1);
		foodList.add(false);//hetero allowed
	
		System.out.println(foodList);
		//isempty, get,addAll, containsall, size, sublist
		
		foodList.addFirst("pizza");
	
		System.out.println(foodList);
		System.out.println(foodList.getFirst());
		//try addlast, getlast, removefirst, removelast
//		foodList.remove

	}

}
