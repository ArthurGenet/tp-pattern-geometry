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

}
