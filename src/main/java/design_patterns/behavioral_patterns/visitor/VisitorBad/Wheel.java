package design_patterns.behavioral_patterns.visitor.VisitorBad;

public class Wheel implements AtvPart {
	@Override
	public double calculateShipping() {
		return 12;
	}
}
