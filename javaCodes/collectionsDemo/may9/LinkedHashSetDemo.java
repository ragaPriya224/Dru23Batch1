package practiccising.main.collectionsDemo.may9;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet foodSet = new LinkedHashSet();
		foodSet.add("biryani");
		foodSet.add("dosa");
		foodSet.add("chapathi");
		foodSet.add("noodles");
		foodSet.add("dosa"); //dup not allowed
		foodSet.add(null);
		foodSet.add(1);
		foodSet.add(false);//insertion order maintained
		System.out.println(foodSet);
//		foodSet.

	}

}
