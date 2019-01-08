package utils;

public class CONSTANTS {
	public static String test1_s1 = "my&friend&Paul   has   heavy   hats!   &";
	public static String test1_s2 = "my   friend   John   has   many   many   friends   &";
	public static String test1_result = "2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss";
	
	public static String test2_s1 = "mmmmm   m   nnnnn   y&friend&Paul   has   heavy   hats!   &";
	public static String test2_s2 = "my   frie   n   d   Joh   n   has   ma   n   y   ma   n   y   frie   n   ds   n&";
	public static String test2_result = "1:mmmmmm/=:nnnnnn/1:aaaa/1:hhh/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss";
	
	public static String test3_s1 = "Are   the   kids   at   home?   aaaaa   fffff";
	public static String test3_s2 = "Yes   they   are   here!   aaaaa   fffff";
	public static String test3_result = "=:aaaaaa/2:eeeee/=:fffff/1:tt/2:rr/=:hh";
	
	public static String DELIMITER_FINAL_SUBSTRING = "/";
	public static String DELIMITER_SINGLE = ":";
	public static String DELIMITER_MULTIPLE = "=:";
	
	public static String SUCCESS_ALL_TESTS = "All tests passed!";
}
