package practiccising.main.java8Code.defStatic;

public interface MobileInterf {


	void m1();//public, abs method

	//can't override
	static void print() { //static method
		System.out.println("i'm static method");
	}
	//can override
	default void switch1() { //default method
	System.out.println("i'm default method");
	}

}
