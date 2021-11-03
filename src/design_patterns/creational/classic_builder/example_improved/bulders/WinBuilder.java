package design_patterns.creational.classic_builder.example_improved.bulders;

import design_patterns.creational.classic_builder.example_improved.products.OperationSystem;

public class WinBuilder implements Builder{
    private final OperationSystem operationSystem;

    public WinBuilder() {
        operationSystem = new OperationSystem();
    }

    @Override
    public void setType() {
        operationSystem.setType("windows 10");
    }

    @Override
    public void setButton() {
        operationSystem.setButton("winButton");
    }

    @Override
    public void setTaskBar() {
        operationSystem.setTaskBar("win taskBar");
    }

    @Override
    public void setIcons() {
        operationSystem.setIcons("win icons");
    }

    @Override
    public OperationSystem getResult() {
        return operationSystem;
    }
}
