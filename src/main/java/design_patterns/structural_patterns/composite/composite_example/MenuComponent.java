package design_patterns.structural_patterns.composite.composite_example;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    public String print(MenuComponent menuComponent) {
        return name + ": " + url + "\n";
    }
}
