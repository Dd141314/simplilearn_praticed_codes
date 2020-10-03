package steams_api;

public class MethodReferenceClass {
	
	public static void helloStaticMethod() {
		System.out.println("POdaaa ");
	}
	
	public void deiThambiNonStatic() {
		System.out.println("Entering into deiThambiNonStatic ");
	}

	public static void main(String[] args) {

		Hello h = ()->System.out.println("Hello Lamda");
		h.hey();
		
		Hello h1 = MethodReferenceClass::helloStaticMethod;
		h1.hey();
		
		Hello h2 = new MethodReferenceClass()::deiThambiNonStatic;
		h2.hey();

	}

}

@FunctionalInterface
interface Hello{
	void hey();
}

