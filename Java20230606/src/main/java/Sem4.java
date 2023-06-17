import static java.lang.System.*;

import java.util.*;
//1. Организовать ввод и
// хранение данных пользователей. ФИО возраст и пол
public class Sem4 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        Scanner iScanner = new Scanner(in);
        out.println("how many people?");
        int n = Integer.parseInt(iScanner.nextLine());
        for (int i = 0; i < n; i++) {
            out.print("surname, name, membership: ");
            String name = iScanner.nextLine();
            out.println("age, gender: ");
            String age = iScanner.nextLine();
            people.add(name + " " + age);
        }
        out.println(people);
        iScanner.close();
        //2. вывод в формате Фамилия И.О. возраст пол
        for (int i = 0; i < people.size(); i++) {
            String[] my_list = people.get(i).split(" ");
            out.println(my_list[0] + " " + my_list[1].toUpperCase().charAt(0) + "."
                    + my_list[2].toUpperCase().charAt(0) + "." + my_list[3]);
        }
        //3. добавить возможность выхода
        // или вывода списка отсортированного по возрасту!)
        //people.sort(Comparator.naturalOrder());
        people.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split(" ")[3])
                        - Integer.parseInt(o2.split(" ")[3]);
            }
        });
        for (int i = 0; i < people.size(); i++) {
            String[] my_list = people.get(i).split(" ");
            out.println(my_list[0] + " " + my_list[1].toUpperCase().charAt(0) + "."
                    + my_list[2].toUpperCase().charAt(0) + "." + my_list[3]);
        }
        //4. реализовать сортировку по возрасту с использованием индексов
        //List keys = 0,1,2,3,4,5,
        //ArrayList keys = new ArrayList<>();

    }

}
