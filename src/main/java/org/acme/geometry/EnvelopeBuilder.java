package org.acme.geometry;

public class EnvelopeBuilder {

	private double xMin;
	private double yMin;
	private double xMax;
	private double yMax;
	
	public void insert(Coordinate coordinate) {
		if (coordinate.getX() < xMin) {
			xMin = coordinate.getX();
		}
		if (coordinate.getX() > xMax) {
			xMax = coordinate.getX();
		}
		if (coordinate.getY() < yMin) {
			yMin = coordinate.getY();
		}
		if (coordinate.getX() > yMax) {
			yMax = coordinate.getY();
		}
	}
	
	public Envelope build() {
		return new Envelope(new Coordinate(xMax, yMin), new Coordinate(xMin, yMax));
	}
}
