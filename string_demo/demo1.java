package string_demo;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		String s2 = "hello";
		String s3 = new String("hello");
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase("HelLo"));
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(0));
		
		for(int i = 0 ; i < s1.length() ; i++) {
			System.out.println(i+" -> " + s1.charAt(i));
		}
		
		System.out.println(s1.substring(1));
		
		System.out.println(s1.substring(1,3));
		
		//It must be ordered
		System.out.println(s1.contains("ello"));
		
		String s4 = "Dd boy geathu";
		String s5[] = s4.split(" ");
		
		for(String s : s5) {
			System.out.println(s);
		}
		
		//Intern method
		s3 = s3.intern();
		System.out.println(s1==s3);
		
		



	}

}
