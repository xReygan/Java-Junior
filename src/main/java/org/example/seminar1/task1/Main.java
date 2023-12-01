package org.example.seminar1.task1;

// Напишите программу, которая использует Stream API для обработки списка чисел.
// Программа должна вывести на экран среднее значение всех четных чисел в списке.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12);

        int[] index = {0};
        double averageOfEvenNumbers = numbers.stream()
                .filter(num -> numbers.get(index[0]++) % 2 == 0)
                .collect(Collectors.summarizingInt(Integer::intValue))
                .getAverage();

        System.out.println(averageOfEvenNumbers);
    }
}
