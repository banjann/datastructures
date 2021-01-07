package com.datastructures.structures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest {
	private DynamicArray<Integer> da;
	private DynamicArray<String> da_string;
	
	@Before
	public void init() {
		da  = new DynamicArray<>();
		da_string = new DynamicArray<>();
	}

	@Test
	public void testDynamicArray_NoLogicMethods() {
		da.add(1);
		da.add(2);
		da.add(3);
		
		assertEquals(3, da.size());
		assertFalse(da.isEmpty());
		
		da.set(2, 5);
		assertEquals(5, (int) da.get(2));
		
		da.clearAll();
		assertTrue(da.isEmpty());
	}
	
	@Test
	public void testDynamicArray_removeAt() {
		da_string.add("first");
		da_string.add("second");
		da_string.add("third");
		da_string.add("four");
		da_string.removeAt(2);
		
		assertEquals(3, da_string.size());
	}
}
