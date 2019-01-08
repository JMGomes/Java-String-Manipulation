package main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import utils.CONSTANTS;

public class MyUnitTest {

	@Test
	public void test1() {
		StringComparatorManager myUnit = new StringComparatorManager();
		String result = myUnit.compareStrings(CONSTANTS.test1_s1,CONSTANTS.test1_s2);
		assertEquals(CONSTANTS.test1_result, result);
	}

	@Test
	public void test2() {
		StringComparatorManager myUnit = new StringComparatorManager();
		String result = myUnit.compareStrings(CONSTANTS.test2_s1,CONSTANTS.test2_s2);
		assertEquals(CONSTANTS.test2_result, result);
	}

	@Test
	public void test3() {
		StringComparatorManager myUnit = new StringComparatorManager();
		String result = myUnit.compareStrings("","");
		assertEquals(CONSTANTS.test3_result, result);
	}
}