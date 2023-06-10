package DZ_java;

import java.util.Random;

//Первый семинар.
public class DZ01 {
    // 1. Выбросить случайное целое число в диапазоне
    // от 0 до 2000 и сохранить в i
    public static void main(String[] args) {
        int i = randomInt(0, 2001);
        System.out.println(i);

        // 2. Посчитать и сохранить в n номер старшего
        // значащего бита выпавшего числа
        //System.out.println(Integer.toBinaryString(i));
        int n = num_most_high_bit(i);
        System.out.println(n);

        //3. Найти все кратные n числа в диапазоне
        // от i до Short.MAX_VALUE сохранить в массив m1
        int[] m1 = find_multiple(n, i, Short.MAX_VALUE);
        System.out.print(m1);
        //4. Найти все некратные n числа в диапазоне
        // от Short.MIN_VALUE до i и сохранить в массив m2
        System.out.println();
        int[] m2 = find_non_multiple(n, Short.MIN_VALUE, i);
        System.out.print(m2);
    }

    static int[] find_non_multiple(int n, short minValue, int i) {
        int count = 0;
        for (int j = minValue; j < i; j++) {
            if (j % n != 0) count++;
        }
        int[] nonmultiplicity = new int[count];
        int ind = 0;
        for (int j = minValue; j < i; j++) {
            if (j % n != 0) nonmultiplicity[ind++] = j;
        }
        return nonmultiplicity;
    }

    private static int[] find_multiple(int n, int i, short maxValue) {
        int count = 0;
        for (int j = i; j < maxValue; j++) {
            if (j % n == 0) count++;
        }
        int[] multiplicity = new int[count];
        int ind = 0;
        for (int j = i; j < maxValue; j++) {
            if (j % n == 0) multiplicity[ind++] = j;
        }
        return multiplicity;
    }
    static void showArray(int[] arr, int numbers){
            for (int j = 0; j < arr.length; j++) {
                if (j != 0 & j % numbers ==0) System.out.println();
                System.out.print(arr[j] + " ");
            }
        }

    static int num_most_high_bit(int i) {
        return  Integer.toBinaryString(i).length();
    }

    static int randomInt(int i, int i1) {
        Random random = new Random();
        return random.nextInt(i,i1);
    }
}
