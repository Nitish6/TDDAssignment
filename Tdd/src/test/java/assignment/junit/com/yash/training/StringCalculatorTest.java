package assignment.junit.com.yash.training;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StringCalculatorTest {

	@InjectMocks
	private	StringCalculator stringCalculator = new StringCalculator();

	@Mock
	private Logger logger;

	@Test
	public void shouldReturnZeroIfEmptyStringPassed() {

		int actualResult = stringCalculator.add(" ");

		assertEquals(0, actualResult);
	}

	@Test
	public void shouldReturnSameInputIfArgumentIsSingle(){

		int actualResult = stringCalculator.add("1");

		assertEquals(1, actualResult);
	}

	@Test
	public void shouldReturnSumIfTwoArgumentsPassed(){

		int actualResult = stringCalculator.add("1,2");

		assertEquals(3, actualResult);
	}

	@Test
	public void shouldReturnSumIfMultipleArgumentsPassed(){

		int actualResult = stringCalculator.add("1,2,3");

		assertEquals(6, actualResult);
	}

	@Test
	public void shouldReturnSumIfMultipleSeparatorsMultipleArgumentsPassed(){

		int actualResult = stringCalculator.add("1\n2,3,2");

		assertEquals(8, actualResult);
	}

	@Test
	public void shouldReturnSumArgumentHavingCustomDelimiter(){

		int actualResult = stringCalculator.add("//;\n1;2");

		assertEquals(3, actualResult);
	}

	@Test
	public void shouldIgnoreNumberBiggerThen1000(){

		int actualResult = stringCalculator.add("1001,2");

		assertEquals(2, actualResult);
	}

	@Test
	public void shouldCheckLogger(){

		Mockito.doNothing().when(logger).info("sum");
		stringCalculator.add("1,2");

		Mockito.verify(logger).info("sum :3");
	}
	
	@Test
	public void shouldThrowExceptionIfNegativeNumberPassed(){
		
		exception.expect(RuntimeException.class);
		exception.expectMessage("negative numbers are : [-2, -3]");
		stringCalculator.add("1,-2,-3");
	}

	@Rule
	public ExpectedException exception = ExpectedException.none();
}
