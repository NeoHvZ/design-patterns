package design_patterns.creational.classic_builder.example_improved.products;

public class OperationSystem {
    private String type;
    private String button;
    private String taskBar;
    private String icons;

    public void setType(String type) {
        this.type = type;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public void setTaskBar(String taskBar) {
        this.taskBar = taskBar;
    }

    public void setIcons(String icons) {
        this.icons = icons;
    }

    @Override
    public String toString() {
        return "OperationSystem{" +
                "type='" + type + '\'' +
                ", button='" + button + '\'' +
                ", taskBar='" + taskBar + '\'' +
                ", icons='" + icons + '\'' +
                '}';
    }
}
