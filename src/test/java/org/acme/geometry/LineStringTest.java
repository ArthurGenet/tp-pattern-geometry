package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testConstructorLineString(){
		LineString l = new LineString();
		Assert.assertEquals(0.0, l.getPoints().get(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(0.0, l.getPoints().get(0).getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testConstructorLineStringPoints(){
		Coordinate c = new Coordinate(2.0, 1.5);
		Point p = new Point(c);
		List<Point> points = new ArrayList<Point>();
		points.add(p);
		LineString l = new LineString(points);
		Assert.assertEquals(2.0, l.getPoints().get(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(1.5, l.getPoints().get(0).getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testLineStringGetType(){
		LineString l = new LineString();
		Assert.assertEquals("LineString", l.getType());
	}
	
	@Test
	public void testLineStringGetString(){
		LineString l = new LineString();
		Assert.assertEquals("LineString", l.getType());
	}
	
	@Test
	public void testLineStringGetNumPoints(){
		LineString l = new LineString();
		Assert.assertEquals(1.0, l.getNumPoints(), EPSILON);
	}
	
	@Test
	public void testLineStringGetPointN(){
		LineString l = new LineString();
		Assert.assertEquals(0.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
	}
	
	@Test
	public void testLineStringTranslate(){
		LineString l = new LineString();
		l.translate(2.0, 3.0);
		Assert.assertEquals(2.0, l.getPoints().get(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(3.0, l.getPoints().get(0).getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testLineStringClone(){
		LineString l = new LineString();
		LineString copy = l.clone();
		Assert.assertNotEquals(copy,l);
		Assert.assertEquals(copy.getPoints().get(0).getCoordinate().getX(), l.getPoints().get(0).getCoordinate().getX(), EPSILON);
	}
}
