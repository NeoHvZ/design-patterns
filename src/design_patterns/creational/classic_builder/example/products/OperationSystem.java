package design_patterns.creational.classic_builder.example.products;

import design_patterns.creational.classic_builder.example.components.OsType;
import design_patterns.creational.classic_builder.example.components.buttons.Button;

public class OperationSystem {
    private final OsType type;
    private final Button button;
    private final String taskBar;
    private final String icons;

    public OperationSystem(OsType type, Button button, String taskBar, String icons) {
        this.type = type;
        this.button = button;
        this.taskBar = taskBar;
        this.icons = icons;
    }

    public OsType getType() {
        return type;
    }

    public Button getButton() {
        return button;
    }

    public String getTaskBar() {
        return taskBar;
    }

    public String getIcons() {
        return icons;
    }

    @Override
    public String toString() {
        return "OperationSystem{" +
                "type=" + type +
                ", button=" + button +
                ", taskBar='" + taskBar + '\'' +
                ", icons='" + icons + '\'' +
                '}';
    }
}
