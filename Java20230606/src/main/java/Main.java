import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 875;
        int g = 't';
        float f = .543f;
        long l;
        double d;
        short sh;
        byte b;
        char ch = 'g'; // индекс в таблице букв
        boolean b1;
        //-------------------------просто одно число

        int[] ints = new int[12];
        Random random = new Random();
        for (int j = 0; j < ints.length; j++) {
            ints[j] = random.nextInt(2000);
        }
        int[] tmp = new int[ints.length + 3];//  увеличиваем массив
        for (int j = 0; j < ints.length; j++) tmp[j] = ints[j];
        ints = tmp;

        i = 0;
        for (int j = 0; j < 12; j++, i += j) ;
        System.out.println(i);

//        if (ch) System.out.println(b1);

        String str = "Привет, Мир!";
        str += "?";
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(1, str.length() - 1));
        System.out.println("HI".charAt(1));
        System.out.println("HI".toLowerCase().repeat(3).length());
        System.out.println(str);
//ctrl alt l

        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            s = scanner.nextLine();
            System.out.println(s);
        }
        while (!s.equals("q"));


    }

}
//Java8 Руководство для начинающих Шестое издание
//Современные методы создания,
//компиляции и выполнения программ на Java
//Герберт Шилдт

