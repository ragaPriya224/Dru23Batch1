package practiccising.main.collectionsDemo.may9;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet foodSet = new TreeSet();
		foodSet.add("biryani");
		foodSet.add("noodles");
		foodSet.add("dosa");
		foodSet.add("chapathi");
		foodSet.add("Pizza");
		foodSet.add("dosa"); //dup not allowed
		foodSet.add(null);
//		foodSet.add(1);
		foodSet.add(false);//
		System.out.println(foodSet);
//		foodSet.

	}
//null pointer exception 
}
