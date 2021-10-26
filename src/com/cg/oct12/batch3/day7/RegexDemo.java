package com.cg.oct12.batch3.day7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "abc", input = "aaaaabcdalsdnfkuyet";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);

		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.find());


	}

}
