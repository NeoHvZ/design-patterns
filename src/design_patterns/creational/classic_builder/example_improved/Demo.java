package design_patterns.creational.classic_builder.example_improved;

import design_patterns.creational.classic_builder.example_improved.bulders.WinBuilder;
import design_patterns.creational.classic_builder.example_improved.products.OperationSystem;
import design_patterns.creational.classic_builder.example_improved.bulders.MacBuilder;
import design_patterns.creational.classic_builder.example_improved.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        MacBuilder macBuilder = new MacBuilder();
        director.setBuilder(macBuilder);
        director.createOS();
        OperationSystem mac = director.getResult();
        System.out.println(mac);

        WinBuilder winBuilder = new WinBuilder();
        director.setBuilder(winBuilder);
        director.createOS();
        OperationSystem win = director.getResult();
        System.out.println(win);
    }
}
