package org.acme.geometry;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {
public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testEnveloppePoint(){
		Geometry geometry = new Point(new Coordinate(3.0,4.0));
		Envelope envelope = geometry.getEnvelope();
		assertEquals(3.0, envelope.getXmax(), EPSILON);
	}
	
	@Test
	public void testEnveloppeLineString(){
		Coordinate c = new Coordinate(4.0, 1.5);
		Coordinate c2 = new Coordinate(1.0, 3.0);
		Point p = new Point(c);
		Point p2 = new Point(c2);
		List<Point> points = new ArrayList<Point>();
		points.add(p);
		points.add(p2);
		Geometry geometry = new LineString(points);
		Envelope envelope = geometry.getEnvelope();
		assertEquals(3.0, envelope.getYmax(), EPSILON);
	}
}
