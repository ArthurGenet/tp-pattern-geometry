package org.acme.geometry;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class WktWriterTest {
	
	
	@Test
	public void testWritePoint(){
		Geometry g = new Point(new Coordinate(3.0,4.0));
		WktWriter writer = new WktWriter();
		assertEquals("POINT(3.0 4.0)", writer.write(g));
	}
	
	@Test
	public void testWriteLineString(){
		Coordinate c = new Coordinate(4.0, 1.5);
		Coordinate c2 = new Coordinate(1.0, 3.0);
		Point p = new Point(c);
		Point p2 = new Point(c2);
		List<Point> points = new ArrayList<Point>();
		
		points.add(p);
		points.add(p2);
		
		Geometry g = new LineString(points);
		WktWriter writer = new WktWriter();
		assertEquals("LINESTRING(4.0 1.5,1.0 3.0)", writer.write(g));
	}
	
}
