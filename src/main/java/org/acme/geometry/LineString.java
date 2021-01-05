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
	
	public int getNumPoints() {
		return this.points.size();
	}
	
	public Point getPointN(int n) {
		return this.points.get(n);
	}
	
	public boolean isEmpty() {
		for (int i = 0; i < this.getNumPoints(); i += 1) {
			if (this.getPointN(i).getCoordinate().isEmpty() == true) {
				return true;
			}
		}
		return false;
	}

	public void translate(double dx, double dy) {
		for (int i = 0; i < this.getNumPoints(); i += 1) {
			this.points.set(i, new Point(new Coordinate(this.getPointN(i).getCoordinate().getX() + dx, this.getPointN(i).getCoordinate().getY() + dy))) ;
		}
	}
	
	@Override
	public LineString clone() {
		List<Point> newPoints = new ArrayList<>(getNumPoints());
		for (Point point : points) {
				newPoints.add(point.clone());
		}
		return new LineString(newPoints);	
	}
}
