package assignment.junit.com.yash.training;

import static org.junit.Assert.*;
import org.junit.Test;


public class WordCounterTest {

	private WordCounter wordCounter = new WordCounter();

	@Test
	public void shouldReturnUniqueWordsWithCount() {

		String actual = wordCounter.getWordsAndCount("Bang Boom Bang Boom");

		assertEquals("{Boom=2, Bang=2}", actual);
	}
}
