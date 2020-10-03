package exceptions;

public class Demo4 {
	
	public boolean isValidAge(int age) throws BusinessException {
		
		if(age < 0) {
			throw new BusinessException("Nee inu vayasu varlaa");
		}
		
		if(age < 18 || age > 33) {
			throw new BusinessException("kealatu payalea poda varlaa");
		}
		
		return true;
	}
	
	public boolean isValidIndianMobileNumber(String mobileNumber) {
		boolean b;
		if(mobileNumber.matches("\\+91[0-9]{10}")) {
			 b = true;
		}else {
			throw new BusinessExceptionUnchecked("Number Thapppu daa puuu");
		}
		return b;
	}

}
