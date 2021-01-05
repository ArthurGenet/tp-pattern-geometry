package org.acme.geometry;

public class GeometryWithCachedEnvelope implements Geometry{

	private Geometry original;
	private Envelope cachedEnvelope;
	
	public GeometryWithCachedEnvelope(Geometry original) {
		this.original = original;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.original.getType();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.original.isEmpty();
	}

	@Override
	public void translate(double dx, double dy) {
		// TODO Auto-generated method stub
		this.original.translate(dx, dy);
	}

	@Override
	public Geometry clone() {
		// TODO Auto-generated method stub
		return this.original.clone();
	}

	@Override
	public Envelope getEnvelope() {
		// TODO Auto-generated method stub
		if (cachedEnvelope == null) {
			this.cachedEnvelope = this.original.getEnvelope();
		}
		return this.cachedEnvelope;
	}

	@Override
	public void accept(GeometryVisitor visitor) {
		// TODO Auto-generated method stub
		this.original.accept(visitor);
	}

	@Override
	public String asText() {
		// TODO Auto-generated method stub
		return this.original.asText();
	}
}
