package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate();
		Assert.assertEquals(0.0, c.getX(), EPSILON);
		Assert.assertEquals(0.0, c.getY(), EPSILON);
	}
	
	@Test
	public void testConstructorXY(){
		Coordinate c = new Coordinate(2.0, 1.5);
		Assert.assertEquals(2.0, c.getX(), EPSILON);
		Assert.assertEquals(1.5, c.getY(), EPSILON);
	}
	
}
