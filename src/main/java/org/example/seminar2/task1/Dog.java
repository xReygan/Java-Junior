package org.example.seminar2.task1;

public class Dog extends Animal {
    private String name;
    private int age;
    private String color;
    private String character;

    public Dog(String name, int age, String color, String character) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.character = character;
    }

    public void makeSound() {
        System.out.println("R-r-r... GAV .. CAv .. Gav .. gav");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                ", character='" + character + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
