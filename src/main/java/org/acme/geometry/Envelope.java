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
		
		return bottomLeft.getX();
		
	}
	
	public double getYmin() {
		
		return bottomLeft.getY();

	}
	
	public double getXmax() {
		
		return topRight.getX();
		
	}
	
	public double getYmax() {
		return topRight.getY();
	}
	
	
}
