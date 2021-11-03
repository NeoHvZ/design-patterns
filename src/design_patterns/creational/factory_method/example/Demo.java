package design_patterns.creational.factory_method.example;

import design_patterns.creational.factory_method.example.factories.Dialog;
import design_patterns.creational.factory_method.example.factories.HtmlDialog;
import design_patterns.creational.factory_method.example.factories.WinDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configuration();
        businessLogic();
    }

    public static void configuration(){
        if(System.getProperty("os.name").equals("Windows 10"))
            dialog = new WinDialog();
        else dialog = new HtmlDialog();
    }

    public static void businessLogic(){
        dialog.render();
    }
}
