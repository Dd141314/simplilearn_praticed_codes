package string_demo;

public class StringBuilderTitleCase {
	
	public static void main(String[] args) {
		String s = "poda venna dei mandaiyaa";
		StringBuilder stringBuilder = new StringBuilder();
		String s1[] = s.split(" ");
		for(String x : s1) {
			//stringBuilder.append((x.charAt(0))).;
		}
		
		System.out.println(stringBuilder);
	} 

}
