package design_patterns.creational.classic_builder.example.builders;

import design_patterns.creational.classic_builder.example.components.OsType;
import design_patterns.creational.classic_builder.example.components.buttons.Button;

public interface Builder {
    void setType(OsType type);
    void setButton(Button button);
    void setTaskBar(String taskBar);
    void setIcons(String icons);
}
