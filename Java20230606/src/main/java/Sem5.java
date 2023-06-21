import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

//1.Создать словарь, ключи индекс
// а значение случайное число. Вывести пары ключ -  значение в консолью
public class Sem5 {
    public static void main(String[] args) {
//        Map<Integer, Integer> dict = new HashMap<>();
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            dict.put(i, random.nextInt(0, 100));
//        }
//        System.out.println(dict);

        //2.Создать словарь, ключи индекс а значение случайное число.
        // Вывести в консоль ключ -  значение тех пар у которых значение кратно трём
//        Map<Integer, Integer> dict = new HashMap<>();
//        Random random = new Random();
//        for (int i = 0; i < 25; i++) {
//            dict.put(i, random.nextInt(0, 100));
//        }
//        System.out.println(dict);
//
//        for (int i: dict.keySet()){
//            if (dict.get(i) % 3 == 0) System.out.println(i+" "+dict.get(i));
//        }
//3.Создать два словаря, ключи обеих словарей случайное число,
// значения первого словаря мужские имена а второго женские.
// Вывести сумму значений тех пар словарей у которых совпал ключ.
//        Map<Integer, String> dict1 = new HashMap<>();
//        Map<Integer, String> dict2 = new HashMap<>();
//        Random random = new Random();
//
//        dict1.put(random.nextInt(0, 10),"Evgenyi");
//        dict1.put(random.nextInt(0, 10),"Denis");
//        dict1.put(random.nextInt(0, 10),"Ivan");
//        dict1.put(random.nextInt(0, 10),"Peter");
//        dict1.put(random.nextInt(0, 10),"Gragh");
//
//        dict2.put(random.nextInt(0, 10),"Anna");
//        dict2.put(random.nextInt(0, 10),"Elena");
//        dict2.put(random.nextInt(0, 10),"Irina");
//        dict2.put(random.nextInt(0, 10),"Marina");
//        dict2.put(random.nextInt(0, 10),"Kristina");
//
//        for (int i: dict1.keySet()){
//            if (dict2.containsKey(i)){
//                System.out.println(dict1.get(i)+" "+dict2.get(i));
//            for (int j: dict2.keySet()){
//                if (i==j) System.out.println(dict1.get(i)+" "+dict2.get(j));
//            }
//        }
//4.Создать словарь, ключ индекс
// а значение это случайное число. Вывести пары ключ и квадрат значения
//        Map<Integer, Integer> dict = new HashMap<>();
//        Random random = new Random();
//        for (int i = 0; i < 9; i++) {
//            dict.put(i, random.nextInt(0, 10));
//        }
//        System.out.println(dict);
//        for (int i : dict.keySet()) {
//            System.out.println(i +" "+ dict.get(i) * dict.get(i));
//        }
        //5.Реализовать предыдущие задание без использования циклов!))
//        Map<Integer, Integer> dict = new HashMap<>();
//        Random random = new Random();
//        for (int i = 0; i < 9; i++) {
//            dict.put(i, random.nextInt(0, 10));
//        }
//        System.out.println(dict);
//        dict.forEach((key, value) ->
//                System.out.println(key + "=" + value * value));

        //6.Реализовать предыдущие задание без использования циклов и forEach!))
        Map<Integer, Integer> dict = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            dict.put(i, random.nextInt(0, 10));
        }
        System.out.println(dict);
        dict.replaceAll((key, value) ->value * value);
        System.out.println(dict);

        dict.compute(7,(key,value)->value!=null?value+1:0);
        System.out.println(dict);

        dict.computeIfAbsent(9,value->value!=null?value+5:59);
        System.out.println(dict);

        dict.computeIfAbsent(10,value->value);
        System.out.println(dict);

        dict.computeIfPresent(9,(key,value)->value!=null?value+1:52);
        System.out.println(dict);

        dict.merge(3,7,(old,n)->old+n);
        System.out.println(dict);

    }
}
