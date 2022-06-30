package corejava.com.demo.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TestMail {

	private static final String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";

	private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	public static boolean isValid(final String email) {
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}

public class EmailValidatorSimple {
	public static void main(String ar[]) {
		TestMail s = null;
		boolean  result =false;
		  result = s.isValid("ram@.com");
		System.out.println(result);
	}

}