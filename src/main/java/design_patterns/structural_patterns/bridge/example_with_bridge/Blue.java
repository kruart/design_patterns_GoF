package design_patterns.structural_patterns.bridge.example_with_bridge;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
