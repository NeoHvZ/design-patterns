package design_patterns.creational.classic_builder.example_improved.bulders;

import design_patterns.creational.classic_builder.example_improved.products.OperationSystem;

public class MacBuilder implements Builder {
    private final OperationSystem operationSystem;

    public MacBuilder() {
        operationSystem = new OperationSystem();
    }

    @Override
    public void setType() {
        operationSystem.setType("macOS");
    }

    @Override
    public void setButton() {
        operationSystem.setButton("macButton");
    }

    @Override
    public void setTaskBar() {
        operationSystem.setTaskBar("mac taskBar");
    }

    @Override
    public void setIcons() {
        operationSystem.setIcons("mac icons");
    }

    @Override
    public OperationSystem getResult() {
        return operationSystem;
    }
}
