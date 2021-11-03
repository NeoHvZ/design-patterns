package design_patterns.creational.classic_builder.example.director;

import design_patterns.creational.classic_builder.example.builders.Builder;
import design_patterns.creational.classic_builder.example.components.OsType;
import design_patterns.creational.classic_builder.example.components.buttons.MacButton;
import design_patterns.creational.classic_builder.example.components.buttons.WinButton;

public class Director {

    public void constructWinOS(Builder builder){
        builder.setButton(new WinButton());
        builder.setType(OsType.Win10);
        builder.setIcons("win10 icons");
        builder.setTaskBar("win10 taskBar");
    }

    public void constructMacOS(Builder builder){
        builder.setButton(new MacButton());
        builder.setType(OsType.Mac);
        builder.setIcons("mac icons");
        builder.setTaskBar("mac taskBar");
    }
}
