package org.acme.geometry;

public class Envelope {

	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Envelope() {
		this.bottomLeft = new Coordinate();
		this.topRight = new Coordinate();
	}
	
	public Envelope(Coordinate bottomLeft, Coordinate topRight) {
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	
	public boolean isEmpty() {
		if (Double.isNaN(topRight.getX()) || Double.isNaN(bottomLeft.getX()) || Double.isNaN(topRight.getY()) || Double.isNaN(bottomLeft.getY())) {
			return true;
		}
		else {
			return false;
		}
	}
	public double getXmin() {
		if (bottomLeft.getX() - topRight.getX() > 0) {
			return topRight.getX();
		}
		else {
			return bottomLeft.getX();
		}
	}
	
	public double getYmin() {
		if (bottomLeft.getY() - topRight.getY() > 0) {
			return topRight.getY();
		}
		else {
			return bottomLeft.getY();
		}
	}
	
	public double getXmax() {
		if (bottomLeft.getX() - topRight.getX() > 0) {
			return bottomLeft.getX();
		}
		else {
			return topRight.getX();
		}
	}
	
	public double getYmax() {
		if (bottomLeft.getY() - topRight.getY() > 0) {
			return bottomLeft.getY();
		}
		else {
			return topRight.getY();
		}
	}
	
	
}
