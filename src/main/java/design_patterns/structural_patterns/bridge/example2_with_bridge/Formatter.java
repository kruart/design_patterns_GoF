package design_patterns.structural_patterns.bridge.example2_with_bridge;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
