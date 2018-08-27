package assignment.junit.com.yash.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCounter {

	public String getWordsAndCount(String input) {

		List<String> wordsList = Arrays.asList(input.split(" "));
		Map<String, Long> wordCount = new HashMap<>();
		wordCount = wordsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return wordCount.toString();
	}
}
