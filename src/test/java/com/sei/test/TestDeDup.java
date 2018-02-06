package com.sei.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sei.java.DeDup;


public class TestDeDup {

	@Test
	public void testRemoveDuplicates(){
		
		final int[] randomIntegers = {1,1,2,3,4,2};
		DeDup deDup = new DeDup();
		int[] uniqueArr = deDup.removeDuplicates(randomIntegers);
		assertEquals( 4,uniqueArr.length);
	}
	@Test
	public void testEliminateDuplicates(){
		
		final int[] randomIntegers = {1,1,2,3,4,2};
		DeDup deDup = new DeDup();
		int[] uniqueArr = deDup.eliminateDuplicates(randomIntegers);
		assertEquals( 4,uniqueArr.length);
		assertNotEquals(randomIntegers.length, uniqueArr.length);
	}
	
	
	@Test
	public void testRemoveDup(){
		final int[] randomIntegers = {1,1,2,3,4,2};
		DeDup deDup = new DeDup();
		int[] uniqueArr = deDup.removeDups(randomIntegers);
		assertEquals( 4,uniqueArr.length);
	}
	
	@Test
	public void testnonDuPArray(){
		final int[] randomIntegers = {1,2,3,4,5};
		DeDup deDup = new DeDup();
		int[] uniqueArr = deDup.removeDups(randomIntegers);
		assertEquals(randomIntegers.length, uniqueArr.length);
	}
	
}
