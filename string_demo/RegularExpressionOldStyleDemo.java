package string_demo;

public class RegularExpressionOldStyleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "fghjkl 56789 *** ---= //// fghjkl FGHJK HDEM,XS6789";
		int alpha = 0;
		int upperCaseAlpha = 0;
		int lowerCaseAlpha = 0;
		int digit = 0;
		int alphaNumeric = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isAlphabetic(c)) {
				alpha++;
			}
			
			if(Character.isUpperCase(c)) {
				upperCaseAlpha++;
			}
			
			if(Character.isLowerCase(c)) {
				lowerCaseAlpha++;
			}
			
			if(Character.isDigit(c)) {
				digit++;
			}
			
			if(Character.isLetterOrDigit(c)) {
				alphaNumeric++;
			}
			
			
			
		}
		
		System.out.println("******* Alphabet Count ******* "+ alpha);
		System.out.println("******* UpperCase Alphabet Count ******* "+ upperCaseAlpha);
		System.out.println("******* LowerCase Alphabet Count ******* "+ lowerCaseAlpha);
		System.out.println("*******  Digit Count ******* "+ digit);
		System.out.println("******* Alpha Numeric Count ******* "+ alphaNumeric);




	}

}
