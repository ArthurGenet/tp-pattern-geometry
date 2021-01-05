package org.acme.geometry;

public class Point implements Geometry{
	
	private Coordinate coordinate;
	
	public Point() {
		Coordinate coordinate = new Coordinate(0.0, 0.0);
		this.coordinate = coordinate;
	}
	
	public Point (Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public String getType() {
		return "Point";
	}

	public boolean isEmpty() {
		if (this.coordinate.isEmpty() == false) {
			return false;
		}
		else {
			return true;
		}
	}

	public void translate(double dx, double dy) {
		this.coordinate = new Coordinate(this.coordinate.getX() + dx, this.coordinate.getY() + dy);
	}
	
	public Point clone() {
		return new Point(coordinate);
	}

}
