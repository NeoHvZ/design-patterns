package design_patterns.creational.abstract_factory.example;

import design_patterns.creational.abstract_factory.example.app.Application;
import design_patterns.creational.abstract_factory.example.factories.GuiFactory;
import design_patterns.creational.abstract_factory.example.factories.MacFactory;
import design_patterns.creational.abstract_factory.example.factories.WinFactory;

public class Demo {

    private static Application configuration() {
        GuiFactory factory;

        if (System.getProperty("os.name").equals("Windows 10")) factory = new WinFactory();
        else factory = new MacFactory();

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configuration();
        app.render();
    }

}
