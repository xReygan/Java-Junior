package org.example.seminar2.task1;

public class Cat extends Animal {
    private String name;
    private int age;
    private String color;
    private String character;

    public Cat(String name, int age, String color, String character) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.character = character;
    }

    public void makeSound() {
        System.out.println("SH-h-h... MAU .. MAu .. Mau .. mau");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                ", character='" + character + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
