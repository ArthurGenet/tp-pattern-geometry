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
	public void testLineStringGetString(){
		LineString l = new LineString();
		Assert.assertEquals("LineString", l.getType());
	}
}
