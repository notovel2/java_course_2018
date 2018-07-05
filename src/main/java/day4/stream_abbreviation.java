package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_abbreviation {
	List<String> filterWords = new ArrayList<String>();
	
	public stream_abbreviation() {
		String[] strArray = {"OF","BY"};
		filterWords.addAll(Arrays.asList(strArray));
	}

	public String process(String input) {
		String[] strArray = input.toUpperCase().split("\\s");
		
		Stream<String> stream = Stream.of(strArray);
		String result = stream.filter(string -> !filterWords.contains(string))
				.map(string -> string.substring(0, 1))
				.collect(Collectors.joining());
		return result;
	}
}
