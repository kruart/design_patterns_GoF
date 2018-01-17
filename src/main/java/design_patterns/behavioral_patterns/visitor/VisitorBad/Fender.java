package design_patterns.behavioral_patterns.visitor.VisitorBad;

public class Fender implements AtvPart {
	@Override
	public double calculateShipping() {
		return 3;
	}
}
