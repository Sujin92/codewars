package com.counting_180219;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
 * charCount 메서드 : 첫 번째 매개변수에서 두 번째 매개변수와 일치하는 문자 갯수를 count로 return
 * ( 소문자 대문자는 상관 없음 )
 */
public class CountCharTest {
	@Test
	public void testSomething() {
		assertEquals(1, CC.charCount("Sujin", 's'));
		assertEquals(4, CC.charCount("FIZZBUZZ", 'z'));
	}
}