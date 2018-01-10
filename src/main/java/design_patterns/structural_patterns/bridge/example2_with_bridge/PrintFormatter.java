package design_patterns.structural_patterns.bridge.example2_with_bridge;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header).append("\n");

        details.forEach(i -> builder.append(i.getLabel())
                .append(":")
                .append(i.getValue())
                .append("\n")
        );

        return builder.toString();
    }
}
