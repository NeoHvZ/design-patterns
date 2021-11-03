package design_patterns.creational.classic_builder.example_simplified;

public class Demo {
    public static void main(String[] args) {
        Person person_A = new Person.Builder("A", "male")
                .setAge(20)
                .build();
        System.out.println(person_A);

        Person person_B = new Person.Builder("B","female")
                .setAge(21)
                .setLocation("China")
                .setMoney(Integer.MAX_VALUE)
                .build();
        System.out.println(person_B);
    }
}
