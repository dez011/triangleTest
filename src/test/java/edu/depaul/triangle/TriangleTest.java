package edu.depaul.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {

	/*
	@Test
	@DisplayName("Should recognize Isosceles triangles")
	void testIsosceles() {
		fail("Not implemented yet");
	}

	@Test
	@DisplayName("Error example")
	void demoError() {
		throw new RuntimeException("Also not implemented yet");
	}
	 */
	@Test
	@DisplayName("a, should recognize Isoceles triangle and pass")
	void testIsosceles(){
		String[] args = {"3", "3", "4"};
		Triangle t = new Triangle(args);
		TriangleType type = t.classify();
		assertEquals(TriangleType.ISOSCELES, type);
	}

	@Test
	@DisplayName("b, should pass but does not throw the error of size being bigger than 300")
	void testEquilateral(){
		String[] args = {"500","500","500"};
		Triangle t = new Triangle(args);
		TriangleType type = t.classify();
		assertEquals(TriangleType.EQUILATERAL, type);
	}

	@Test
	@DisplayName("c, should recognize scalene triangless and pass")
	void testScalenetest(){
		String[] args = {"3","4","5"};
		Triangle t = new Triangle(args);
		TriangleType type = t.classify();
		assertEquals(TriangleType.SCALENE, type);
	}

}
