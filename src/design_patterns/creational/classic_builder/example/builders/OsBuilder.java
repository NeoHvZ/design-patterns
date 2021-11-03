package design_patterns.creational.classic_builder.example.builders;

import design_patterns.creational.classic_builder.example.components.OsType;
import design_patterns.creational.classic_builder.example.components.buttons.Button;
import design_patterns.creational.classic_builder.example.products.OperationSystem;

public class OsBuilder implements Builder{
    private OsType type;
    private Button button;
    private String taskBar;
    private String icons;

    @Override
    public void setType(OsType type) {
        this.type=type;
    }

    @Override
    public void setButton(Button button) {
        this.button=button;
    }

    @Override
    public void setTaskBar(String taskBar) {
        this.taskBar=taskBar;
    }

    @Override
    public void setIcons(String icons) {
        this.icons=icons;
    }

    public OperationSystem getResult(){
        return new OperationSystem(type,button,taskBar,icons);
    }
}
