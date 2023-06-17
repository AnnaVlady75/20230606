package DZ_java;
import static java.lang.System.*;
import java.util.*;
//1. Организовать ввод и
// хранение данных пользователей. ФИО возраст и пол
public class DZ04 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        Scanner iScanner = new Scanner(in);
        out.println("Количество вводимых данных: ");
        int n = Integer.parseInt(iScanner.nextLine());
        for (int i = 0; i < n; i++) {
            out.print("Фамилия, имя, отчетсво, возраст, пол ");
            String datas = iScanner.nextLine();
            people.add(datas);
        }
        out.println(people);
        iScanner.close();
        //2. вывод в формате Фамилия И.О. возраст пол
        out.println("Фамилия И.О. возраст пол ");
        for (int i = 0; i < people.size(); i++) {
            String[] my_list = people.get(i).split(" ");
            out.println(my_list[0] + " "
                    + my_list[1].toUpperCase().charAt(0) + "."
                    + my_list[2].toUpperCase().charAt(0) + "."+ " "
                    + my_list[3] + " " + my_list[4]);
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
        out.println("Отсортированные данные по возрасту: ");
        for (int i = 0; i < people.size(); i++) {
            String[] my_list = people.get(i).split(" ");
            out.println(my_list[0] + " " + my_list[1].toUpperCase().charAt(0) + "."
                    + my_list[2].toUpperCase().charAt(0) + "." + my_list[3] + " " + my_list[4]);
        }
        //4. реализовать сортировку по возрасту с использованием индексов
//        int[] index = new int[people.size()];
//        Object[] input = people.toArray();
//        for (int i = 0; i < people.size(); i++) {
//            index[i] = i+1;
//        }
//        for (int i = people.size()-1; i > 0; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = index[j];
//                index[j]= index[i];
//                index[i]= temp;
//            }
//        }
//        System.out.print("Отсортированные символы: ");
//        for (int i = 0; i < people.size(); i++)
//            System.out.printf("%2c", input[i]);
//        System.out.printf("\nИндексы до сортировки: ");
//        for (int i = 0; i < people.size(); i++)
//            System.out.printf("%2d", index[i]);
//        System.out.println();
    }
}


