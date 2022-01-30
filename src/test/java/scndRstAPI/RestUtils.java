package scndRstAPI;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
public static String getusername() {
	String gen = RandomStringUtils.randomAlphabetic(5);
	return ("Rash"+gen);
	
}
public static String getjob() {
	String gen2 = RandomStringUtils.randomAlphabetic(2);
	return ("Rash"+gen2);
}
}