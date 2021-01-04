package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry{
	
	private List<Point> points = new ArrayList<Point>();
	
	public LineString() {
		Point point = new Point();
		this.points.add(point);
	}
	
	public LineString(List<Point> points) {
		this.points = points;
	}

	public List<Point> getPoints() {
		return points;
	}
	
	public String getType() {
		return "LineString";
	}
}
