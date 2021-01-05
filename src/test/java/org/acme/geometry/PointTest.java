package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void testPointIsEmpty(){
		Point p = new Point();
		Assert.assertEquals(false, p.isEmpty());
	}
	
	@Test
	public void testTranslate(){
		Point p = new Point();
		p.translate(2.0, 3.0);
		Assert.assertEquals(2.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(3.0, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testPointClone(){
		Point p = new Point();
		Point copy = p.clone();
		Assert.assertNotEquals(copy, p);
		Assert.assertEquals(copy.getCoordinate().getX(), p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(copy.getCoordinate().getY(), p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testPointGetEnvelope(){
		Coordinate c = new Coordinate(4.0, 1.5);
		Point p = new Point(c);


		Assert.assertEquals(4.0, p.getEnvelope().getXmax(), EPSILON);
		Assert.assertEquals(1.5, p.getEnvelope().getYmax(), EPSILON);
		Assert.assertEquals(4.0, p.getEnvelope().getXmin(), EPSILON);
		Assert.assertEquals(1.5, p.getEnvelope().getYmin(), EPSILON);
	}
}
