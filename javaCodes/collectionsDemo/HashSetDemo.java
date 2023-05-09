package practiccising.main.collectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet foodSet = new HashSet();
		foodSet.add("biryani");
		foodSet.add("dosa");
		foodSet.add("chapathi");
		foodSet.add("noodles");
		foodSet.add("dosa"); //dup not allowed
		foodSet.add(null);
		foodSet.add(1);
		foodSet.add(false);//h
		System.out.println(foodSet);
//		foodSet.

	}

}
