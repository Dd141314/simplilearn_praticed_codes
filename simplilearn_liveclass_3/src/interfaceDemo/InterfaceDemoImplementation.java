package interfaceDemo;

public class InterfaceDemoImplementation implements InterfaceDemo,InterfaceDemo2{

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println(" Da in method one ");
		
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println(" Da in method two ");
	}
	
	
	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("Incrementing x "+ InterfaceDemo2.x);
	}
	

	

}
