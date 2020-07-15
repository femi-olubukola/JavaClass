package com.deitel7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KnightsTourTest {
	KnightsTour knight;

	@BeforeEach
	void setUp() {
		knight = new KnightsTour();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testKnight() {
		int[] horizontal = {2,2,1,-2,1,1,2,-1};
		int[] vertical = {1,-1,2,1,2,-2,1,2};
		knight.moveKnight(horizontal, vertical);
		knight.showBoard();
		
	}

}
