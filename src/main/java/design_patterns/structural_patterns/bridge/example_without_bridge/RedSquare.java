package design_patterns.structural_patterns.bridge.example_without_bridge;

public class RedSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
