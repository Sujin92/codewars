package com.counting_180219;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
 * charCount �޼��� : ù ��° �Ű��������� �� ��° �Ű������� ��ġ�ϴ� ���� ������ count�� return
 * ( �ҹ��� �빮�ڴ� ��� ���� )
 */
public class CountCharTest {
	@Test
	public void testSomething() {
		assertEquals(1, CC.charCount("Sujin", 's'));
		assertEquals(4, CC.charCount("FIZZBUZZ", 'z'));
	}
}