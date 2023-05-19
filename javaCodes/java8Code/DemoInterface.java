package practiccising.main.java8Code;

public interface DemoInterface {
 void m1();
 default void m2() {
	 System.out.println(" i'm m2 method");
 }
}
