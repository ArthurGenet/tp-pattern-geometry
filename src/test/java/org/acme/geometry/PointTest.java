package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testConstructorPoint(){
		Point p = new Point();
		Assert.assertEquals(0.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(0.0, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testConstructorPointCoordinate(){
		Coordinate c = new Coordinate(2.0, 1.5);
		Point p = new Point(c);
		Assert.assertEquals(2.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(1.5, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testPointGetString(){
		Point p = new Point();
		Assert.assertEquals("Point", p.getType());
	}
}
