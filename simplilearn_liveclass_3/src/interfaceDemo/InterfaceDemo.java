package interfaceDemo;

public interface InterfaceDemo {
	
	void methodOne();
	void methodTwo();
	 
	default void methodThreeDefault() {
		System.out.println("Hi da method three");
	}
	
	int x = 10;

}
