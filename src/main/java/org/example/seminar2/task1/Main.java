package org.example.seminar2.task1;

// Создайте абстрактный класс "Animal" с полями "name" и "age".
// Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
// Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
// Выведите на экран информацию о каждом объекте.
// Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {

        Animal[] animal =  new Animal[6];
        animal[0] = new Dog("Rex", 11, "ready", "frowning");
        animal[1] = new Dog("Abrek", 3, "black", "pest");
        animal[2] = new Dog("Gaga", 7, "blu", "fuzzy");
        animal[3] = new Cat("Murcka", 1, "smoky", "soft");
        animal[4] = new Cat("Lego", 7, "white", "calm");
        animal[5] = new Cat("Kadr", 4, "ginger", "fast");

        Class<?> animalClass = Class.forName("org.example.seminar2.task1.Animal");
        Method makeSoundMethod = animalClass.getDeclaredMethod("makeSound");

        for (Animal item : animal) {
            System.out.println(item);
            fieldsReflect(item);
            constructsReflect(item);
            methodsReflect(item);
            makeSoundMethod.invoke(item); // Вызов метода "makeSound()" у каждого объекта, если такой метод присутствует
            System.out.println();
        }
    }

    // Получить список всех полей
    private static <T> void fieldsReflect(T obj) {
        Class <?> objClass = obj.getClass();
        Field[] fields = objClass.getDeclaredFields();
        for (Field field : fields){
            System.out.println("Поле: " + field.getName());
        }
    }

    // Получить список всех конструкторов
    private static <T> void constructsReflect(T obj) {
        Class <?> objClass = obj.getClass();
        Constructor[] constructors = objClass.getConstructors();
        for (Constructor construct : constructors){
            System.out.println("Конструктор: " + construct);
        }
    }

    // Получить список всех методов
    private static <T> void methodsReflect(T obj) {
        Class <?> objClass = obj.getClass();
        Method[] methods = objClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Метод: " + method);
        }
    }
}
