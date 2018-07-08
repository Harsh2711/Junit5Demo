package com.parameterizeexample;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamertizeAnnoationExam {

	@ParameterizedTest
	@ValueSource(strings = { "racecar", "", "able was I ere I saw elba" })
	void palindromes(String candidate) {
	    assertTrue(IsStringNull(candidate));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	void testWithValueSource(int argument) {
	    assertTrue(argument > 0 && argument < 4);
	}
	
	@ParameterizedTest
	@MethodSource("stringProvider")
	void testWithSimpleMethodSource(String argument) {
	    assertNotNull(argument);
	}
	
	@ParameterizedTest
	@CsvSource({ "foo, 1", "bar, 2", "'baz, qux', 3" })
	void testWithCsvSource(String first, int second) {
	    assertNotNull(first);
	    assertNotEquals(0, second);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/testdata.csv")
	void testWithCsvFileSource(String first, int second) {
	    System.out.println("first"+first);
		assertNotNull(first);
	    assertNotEquals(0, second);
	}

	static Stream<String> stringProvider() {
	    return Stream.of("foo", "bar");
	}
	
	public boolean IsStringNull(String value)
	{
		return value.length()>0;
	}
}
