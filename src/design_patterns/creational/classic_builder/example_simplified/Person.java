package design_patterns.creational.classic_builder.example_simplified;

public class Person {
    // necessary fields
    private final String name;
    private final String sex;
    // not necessary fields
    private final int age;
    private final String location;
    private final int money;

    public Person(Builder builder) {
        name = builder.name;
        sex = builder.sex;
        age = builder.age;
        location = builder.location;
        money = builder.money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", money=" + money +
                '}';
    }

    public static class Builder {
        private final String name;
        private final String sex;
        private int age;
        private String location;
        private int money;

        public Builder(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setMoney(int money) {
            this.money = money;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
