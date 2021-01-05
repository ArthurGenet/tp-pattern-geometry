package org.acme.geometry;

public abstract class AbstractGeometry implements Geometry{
	
	@Override
	public String asText() {
		WktVisitor visitor = new WktVisitor();
		accept(visitor);
		return visitor.getResult();
	}
	
	@Override
	public Envelope getEnvelope() {
		EnvelopeBuilder visitor = new EnvelopeBuilder();
		accept(visitor);
		return visitor.build();
	}
	
	
	public abstract Geometry clone();
}
