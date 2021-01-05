package org.acme.geometry;

public class WktVisitor implements GeometryVisitor{

	private StringBuilder buffer = new StringBuilder();
	
	public String getResult() {
		return this.buffer.toString();
	}
	
	@Override
	public void visit(Point point) {
		this.buffer.append("POINT("+point.getCoordinate().getX()+" "+point.getCoordinate().getY()+")");
	}

	@Override
	public void visit(LineString lineString) {
		this.buffer.append("LINESTRING(");
	    for (int i = 0; i < lineString.getNumPoints(); i += 1) {
	    	this.buffer.append(lineString.getPointN(i).getCoordinate().getX()+" "+lineString.getPointN(i).getCoordinate().getY());
	    	if (i < lineString.getNumPoints() - 1) {
	    		this.buffer.append(",");
	    	}
	    }
	    this.buffer.append(")");
	}

}
