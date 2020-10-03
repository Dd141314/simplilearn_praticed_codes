package exceptions;

public class Demo4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 demo4 = new Demo4();
		
		try {
			demo4.isValidAge(22);
			System.out.println("Age is Valid");
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			demo4.isValidIndianMobileNumber("9092900277");
			System.out.println("Mobile Valid");
		}catch (BusinessExceptionUnchecked be){
			System.out.println(be.getMessage());
		}

	}

}
