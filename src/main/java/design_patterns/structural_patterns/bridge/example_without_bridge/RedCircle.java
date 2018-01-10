package design_patterns.structural_patterns.bridge.example_without_bridge;

public class RedCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
