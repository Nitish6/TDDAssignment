package assignment.junit.com.yash.training;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StringCalculator {

	private Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public int add(String inputString) {

		int sum = 0;
		
		if (inputString.equals(" ")) {
			logger.info("sum :" + sum);
		} else {

			String delimiter = null;
			if(inputString.startsWith("//")){
				delimiter = inputString.substring(2, 3);
				inputString = inputString.substring(inputString.indexOf("\n") + 1);
			}
			String[] numbers = inputString.split(",|\n|" + delimiter);
			List<String> numberString = Arrays.asList(numbers);
			sum = numberString.stream().map(n -> Integer.parseInt(n)).filter(n -> n <= 1000).collect(Collectors.reducing((n1, n2) -> n1 + n2)).get();
			logger.info("sum :" + sum);
		}
		
		return sum;
	}

}
