package assignment.junit.com.yash.training;

public class FizzBuzz {

	public String checkDivisibility(Integer number) {
		String output = null;

		if (number % 3 == 0 && number % 5 == 0) {
			output = "FizzBuzz";
		} else if (number % 5 == 0) {
			output = "Buzz";
		} else if (number % 3 == 0) {
			output = "Fizz";
		} else {
			output = String.valueOf(number);
		}

		return output;
	}
}
