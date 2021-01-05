package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometryVisitorTest {
	
	@Test
	public void testVisitPoint(){
		LogGeometryVisitor visitor = new LogGeometryVisitor();
		Geometry geometry = new Point(new Coordinate(3.0,4.0));
		System.out.println("\nExpect : Je suis un point avec x = 3.0 et y = 4.0");
		System.out.print("Got : ");
		geometry.accept(visitor);
	}
	
	@Test
	public void testVisitLineString(){
		LogGeometryVisitor visitor = new LogGeometryVisitor();
		Geometry geometry = new LineString();
		System.out.println("\nExpect : Je suis une polyligne avec 1 point(s)");
		System.out.print("Got : ");
		geometry.accept(visitor);
	}
}
