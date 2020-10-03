package string_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNewStyle {

	public static void main(String[] args) {
		/*
		 * Regular Expression
		 * Works based on Pattern Matching
		 * Provides set of Wild Cards which we can compare a pattern of String
		 * 
		 * [] -> refers to expression/pattern
		 * {} -> length
		 * ^  -> Not
		 * 
		 * Example [a-z]{5} - any lowercase of 5 letters
		 * 
		 * Java Regex is an API for searching and Manipulating Strings
		 * 
		 */
		
		//Matcher Class
		/* 
		 * Example for matcher class
		 * 
		 * */
		
		Pattern pattern = Pattern.compile(".XX.");
		Matcher matcher = pattern.matcher("DXXd");
		System.out.println("Check the Matches Value " + matcher.matches());
		
		 
		/*
		 * Regex Character Class Example 
		 * [ABC] Values not exists more than once eg AABC
		 * from ABC Yetho oru value than varanum either A or B or C
		 * not than ABC naalu false than
		 */
		System.out.println(Pattern.matches("[ABC]","B"));
		
		/*
		 * Regex Quantifier Examples
		 * 
		 */
		// ? Quantifier
		/*
		 * It must occur one time or not
		 * all three should not occur one time
		 * other values should not occur
		 */
		System.out.println("*******? Quantifier******** ");
		System.out.println(Pattern.matches("[abc]?", "b"));
		System.out.println(Pattern.matches("[abc]?", "c"));
		System.out.println(Pattern.matches("[abc]?", "abc"));
		System.out.println(Pattern.matches("[abc]?", "d"));
		
		/*
		 * + Quantifier
		 * it should occurs one time but also maximum it should occurs many time
		 * other values not in the pattern wont work
		 */

		System.out.println("*******+ Quantifier******** ");
		System.out.println(Pattern.matches("[abc]+", "aaabc"));
		System.out.println(Pattern.matches("[abc]+", ""));
		System.out.println(Pattern.matches("[abc]+", "abc"));
		System.out.println(Pattern.matches("[abc]+", "aaabbbccc"));
		
		/*
		 * * Quantifiers
		 * 
		 */
		System.out.println("******** Quantifier******** ");
		System.out.println(Pattern.matches("[abc]*", "aaabc"));
		System.out.println(Pattern.matches("[abc]*", "bc"));
		System.out.println(Pattern.matches("[abc]*", "abc"));
		System.out.println(Pattern.matches("[abc]*", "aaabbbccc"));

		
		



		
 
		
		
		
		//[ [A-Z]{5}[0-9]{4}[A-Z]{1}]
	}
}
