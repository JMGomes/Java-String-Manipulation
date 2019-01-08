package utils;

public class Utils {
	public static String repeat(char character, int times) {
		return new String(new char[times]).replace('\0', character);
	}
}
