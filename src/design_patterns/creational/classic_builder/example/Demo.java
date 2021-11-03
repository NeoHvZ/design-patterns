package design_patterns.creational.classic_builder.example;

import design_patterns.creational.classic_builder.example.builders.OsBuilder;
import design_patterns.creational.classic_builder.example.director.Director;
import design_patterns.creational.classic_builder.example.products.OperationSystem;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        OsBuilder osBuilder = new OsBuilder();

        director.constructWinOS(osBuilder);
        OperationSystem win10 = osBuilder.getResult();
        System.out.println(win10);

        director.constructMacOS(osBuilder);
        OperationSystem mac = osBuilder.getResult();
        System.out.println(mac);
    }
}
