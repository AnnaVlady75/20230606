package DZ_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре
// будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.
public class DZ05 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        ArrayList<String> name1 = new ArrayList<>();
        name1.add("Irina");
        phoneBook.putIfAbsent("+375298075547,+375447652213", name1);
        ArrayList<String> name2 = new ArrayList<>();
        name2.add("Deinis");
        phoneBook.putIfAbsent("+375299875634", name2);
        ArrayList<String> name3 = new ArrayList<>();
        name3.add("Irina");
        phoneBook.putIfAbsent("+375298750034", name3);
        ArrayList<String> name4 = new ArrayList<>();
        name4.add("Olga");
        phoneBook.putIfAbsent("+375254378800,+375293442010,+375445607373", name4);

        System.out.println("Телефонная книга по убыванию числа телефонов" + phoneBook);
        System.out.println("Как-то так!)))");
    }
}
