package org.acme.geometry;

public class WktWriter {
	public String write(Geometry geometry) {
		if ( geometry instanceof Point ){
		    Point point = (Point)geometry;
		    return new String("POINT("+point.getCoordinate().getX()+" "+point.getCoordinate().getY()+")");
		}else if ( geometry instanceof LineString ){
		    LineString lineString = (LineString)geometry;
		    String stringLineString = "LINESTRING(";
		    for (int i = 0; i < lineString.getNumPoints(); i += 1) {
		    	stringLineString += lineString.getPointN(i).getCoordinate().getX()+" "+lineString.getPointN(i).getCoordinate().getY();
		    	if (i < lineString.getNumPoints() - 1) {
		    		stringLineString += ",";
		    	}
		    }
		    stringLineString += ")";
		    return stringLineString;
		}else{
		    throw new RuntimeException("geometry type not supported");
		}
	}
}
