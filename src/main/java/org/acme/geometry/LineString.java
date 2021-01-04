package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry{
	
	private List<Point> points = new ArrayList<Point>();
	
	public LineString() {
		Coordinate coordinate = new Coordinate(0.0, 0.0);
		Point point = new Point(coordinate);
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
	
	public boolean isEmpty() {
		for (int i = 0; i < this.points.size(); i += 1) {
			if (this.points.get(i).getCoordinate().isEmpty() == true) {
				return true;
			}
		}
		return false;
	}
}
