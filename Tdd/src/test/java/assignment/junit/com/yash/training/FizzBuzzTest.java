package assignment.junit.com.yash.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	public void shouldReturnFizzIfNumberDivisibleByThree() {

		String actual = fizzBuzz.checkDivisibility(3);

		assertEquals("Fizz", actual);
	}

	@Test
	public void shouldReturnBuzzIfNumberDivisibleByFive() {

		String actual = fizzBuzz.checkDivisibility(5);

		assertEquals("Buzz", actual);
	}

	@Test
	public void shouldReturnFizzBuzzIfNumberDivisibleByThreeAndFive() {

		String actual = fizzBuzz.checkDivisibility(15);

		assertEquals("FizzBuzz", actual);
	}

	@Test
	public void shouldReturnNumberIfNumberNotDivisibleByThreeOrFive() {

		String actual = fizzBuzz.checkDivisibility(17);

		assertEquals("17", actual);
	}

}
