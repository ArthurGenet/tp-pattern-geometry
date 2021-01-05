package org.acme.geometry;

public class EnvelopeBuilder implements GeometryVisitor{

	private double xMin = Double.NaN;
	private double yMin = Double.NaN;
	private double xMax = Double.NaN;
	private double yMax = Double.NaN;
	
	public void insert(Coordinate coordinate) {
		
		if (Double.isNaN(xMin)) {
			xMin = coordinate.getX();
			yMin = coordinate.getY();
			xMax = coordinate.getX();
			yMax = coordinate.getY();
		}
		if (coordinate.getX() < xMin) {
			xMin = coordinate.getX();
		}
		if (coordinate.getX() > xMax) {
			xMax = coordinate.getX();
		}
		if (coordinate.getY() < yMin) {
			yMin = coordinate.getY();
		}
		if (coordinate.getY() > yMax) {
			
			yMax = coordinate.getY();
			
			
		}
	}
	
	public Envelope build() {
		
		return new Envelope(new Coordinate(xMin, yMin), new Coordinate(xMax, yMax));
	}

	@Override
	public void visit(Point point) {
		insert(point.getCoordinate());
	}

	@Override
	public void visit(LineString lineString) {
		for (int i = 0; i < lineString.getNumPoints(); i += 1) {
			insert(lineString.getPointN(i).getCoordinate());
		}
		
	}
}
