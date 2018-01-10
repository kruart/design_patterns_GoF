package design_patterns.structural_patterns.bridge.example_without_bridge;

public class ShapeWithoutBridgeDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();

        //every time when i need new color or shape, i need to create new class(es)
        Square greenSuare = new GreenSquare();
        greenSuare.applyColor();
    }
}
