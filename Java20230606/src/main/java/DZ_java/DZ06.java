package DZ_java;
//Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент,
// метод toString возвращающий строку с элементами множества
// *и метод позволяющий читать элементы по индексу.
//*Реализовать все методы из семинара.
//Формат данных Integer.

import java.util.HashMap;
import java.util.Iterator;

public class DZ06 {
    public static void main(String[] args) {
        Set<Integer> mySet = new Set();
        mySet.add(777);
        mySet.add(555);
        mySet.add(333);
        mySet.add(575);
        Iterator<Integer> it = mySet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(((Set<Integer>) mySet).elemByIndex(0));
    }
}
class Set<E> {
    private HashMap<E, Object> set = new HashMap<>();
    private static final Object VALL = new Object();

    public boolean add(E tel) {
        return set.put(tel, VALL) == null;
    }

    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }
    int elemByIndex(int index){
        return (Integer)set.keySet().toArray()[index];
    }
}
