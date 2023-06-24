import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//второй вариант ДЗ 6
public class Phonebook {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //map.put("Ivan". Arrays.aslist("123","234","345"));
        //map.put("Ivan",List.of("123"));
//        addPhone(map, "Ivan", "123");
//        addPhone(map, "Ivan", "234");
//        addPhone(map, "Ivan", "456");
//        addPhone(map, "Peter", "987");
//        addPhone(map, "Irina", "112");
//        addPhone(map, "Irina", "234");

        map.merge("Ivan", "123", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Ivan", "234", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Ivan", "456", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Peter", "987", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Ivan", "234", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Irina", "112", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Irina", "234", (o, n) -> o == null ? n : o + " " + n);

        System.out.println(map);
        ArrayList<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            list.add(s);
        }
        Collections.sort(list, (o1, o2) -> map.get(01).split(" ").length - map.get(02).split(" ").length);
        list.forEach(n -> System.out.println(n + "=" + map.get(n).split(" ").length));
        //System.out.println(list);
    }

    private static void addPhone(HashMap<String, ArrayList<String>> map, String name, String phone) {
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(phone);
    }
}
