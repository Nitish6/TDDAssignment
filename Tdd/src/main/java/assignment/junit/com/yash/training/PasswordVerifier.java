package assignment.junit.com.yash.training;

import java.util.regex.Pattern;

public class PasswordVerifier {

	public Boolean verify(String password) {

		Boolean passwordVerify = false;
		String lengthPattern = ".{8,}";
		Pattern upperPattern = Pattern.compile("[A-Z]");
		Pattern lowerPattern = Pattern.compile("[a-z]");
		Pattern numberPattern = Pattern.compile("[0-9]");

		if (password == null) {
			throw new RuntimeException("Password can not be null");
		}

		if (passwordVerify == lowerPattern.matcher(password).find()) {
			throw new RuntimeException("password should contain at least one lower case");
		}

		if (password.matches(lengthPattern)) {
			passwordVerify = true;
		} else if (upperPattern.matcher(password).find()) {
			passwordVerify = true;
		} else if (numberPattern.matcher(password).find()) {
			passwordVerify = true;
		} else {
			throw new RuntimeException(
					"password should contain atleast one upper or atleast one number or length more than 8 ");
		}

		return passwordVerify;
	}
}