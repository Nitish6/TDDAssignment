package assignment.junit.com.yash.training;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PasswordVerifierTest {

	private PasswordVerifier passwordVerifier = new PasswordVerifier();

	@Test
	public void shouldCheckPasswordLengthMoreThanEight() {

		boolean actual = passwordVerifier.verify("yashTechnologies");

		assertEquals(true, actual);

	}

	@Test(expected = RuntimeException.class)
	public void shouldCheckPasswordNotNull() {

		passwordVerifier.verify(null);

	}

	@Test
	public void shouldHaveAtLeastOneUpperCaseCharacter() {

		boolean actual = passwordVerifier.verify("yashTechnologies");

		assertEquals(true, actual);

	}

	@Test
	public void shouldHaveAtLeastOneLowerCaseCharacter() {

		boolean actual = passwordVerifier.verify("YASHTECHNologies");

		assertEquals(true, actual);
	}

	@Test
	public void shouldHaveAtLeastOneNumber() {

		boolean actual = passwordVerifier.verify("YASHTECHNologies1");

		assertEquals(true, actual);
	}

	@Test
	public void shouldThrowExceptionIfPasswordNotHaveAtLeastOneLowerCase() {

		exception.expect(RuntimeException.class);
		exception.expectMessage("password should contain at least one lower case");
		passwordVerifier.verify("YASHTECHNOLOGIES");
	}

	@Rule
	public ExpectedException exception = ExpectedException.none();
}
