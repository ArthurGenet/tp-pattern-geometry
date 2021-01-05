package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeometryVisitorTest {
	

	ByteArrayOutputStream os = new ByteArrayOutputStream();
	PrintStream out = new PrintStream(os);
	
	
	@Test 
	public void testPointB() throws UnsupportedEncodingException {
		
		LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		Geometry geometry = new Point(new Coordinate(3.0,4.0));
		geometry.accept(visitor);
		
		String output = os.toString("UTF8");
		Assert.assertEquals("Je suis un point avec x = 3.0 et y = 4.0", output);
		
	}
	
	@Test 
	public void testLineStringAB() throws UnsupportedEncodingException {
		
		LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		
		Coordinate c = new Coordinate(4.0, 1.5);
		Coordinate c2 = new Coordinate(1.0, 3.0);
		Point p = new Point(c);
		Point p2 = new Point(c2);
		List<Point> points = new ArrayList<Point>();
		points.add(p);
		points.add(p2);
		Geometry geometry = new LineString(points);
		
		geometry.accept(visitor);
		
		String output = os.toString("UTF8");
		Assert.assertEquals("Je suis une polyligne avec 2 point(s)", output);
		
	}
	
	@Test
	public void testVisitWktPoint(){
		WktVisitor visitor = new WktVisitor();
		Geometry geometry = new Point(new Coordinate(3.0,4.0));
		geometry.accept(visitor);
		Assert.assertEquals("POINT(3.0 4.0)",visitor.getResult());
	}
	
	@Test
	public void testVisitWktLineString(){
		WktVisitor visitor = new WktVisitor();
		Geometry geometry = new LineString();
		geometry.accept(visitor);
		Assert.assertEquals("LINESTRING(0.0 0.0)",visitor.getResult());
	}
}
