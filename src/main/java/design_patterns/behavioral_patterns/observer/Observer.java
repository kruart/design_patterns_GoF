package design_patterns.behavioral_patterns.observer;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
