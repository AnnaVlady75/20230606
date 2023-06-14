package DZ_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;
import static java.util.Collections.min;

//Пусть дан произвольный список из 100 целых чисел.
//
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
public class DZ03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(100));
        }
        out.println("Список случайных чисел: "+list);

        list.removeIf(n -> n % 2 == 0);
        out.println("Список без четных чисел: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        out.println("Минимальное значение: " + min);
        out.println("Максимальное значение: " + max);
        out.println("Среднее арифметическое значение: " + average);
    }
}


