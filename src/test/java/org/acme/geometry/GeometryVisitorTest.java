package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometryVisitorTest {
	
	@Test
	public void testVisitLogGeometryPoint(){
		LogGeometryVisitor visitor = new LogGeometryVisitor();
		Geometry geometry = new Point(new Coordinate(3.0,4.0));
		System.out.println("\nExpect : Je suis un point avec x = 3.0 et y = 4.0");
		System.out.print("Got : ");
		geometry.accept(visitor);
	}
	
	@Test
	public void testVisitLogGeometryLineString(){
		LogGeometryVisitor visitor = new LogGeometryVisitor();
		Geometry geometry = new LineString();
		System.out.println("\nExpect : Je suis une polyligne avec 1 point(s)");
		System.out.print("Got : ");
		geometry.accept(visitor);
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
