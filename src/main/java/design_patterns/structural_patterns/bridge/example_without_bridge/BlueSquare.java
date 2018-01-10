package design_patterns.structural_patterns.bridge.example_without_bridge;

public class BlueSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
