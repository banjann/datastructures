package com.datastructures.structures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest {
	private DynamicArray<Integer> da;
	
	@Before
	public void init() {
		da  = new DynamicArray<>();
	}

	@Test
	public void testDynamicArray_size() {
		assertEquals(0, da.size());
		
		da.add(1);
		da.add(2);
		assertEquals(2, da.size());
	}

}
