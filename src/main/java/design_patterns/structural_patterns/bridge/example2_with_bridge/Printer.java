package design_patterns.structural_patterns.bridge.example2_with_bridge;

import java.util.List;

public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();
    abstract protected String getHeader();

}
