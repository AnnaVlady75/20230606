
//Лекция 3

//public class Collections {
//    public static void main(String[] args) {
//        Object o = 1; GetType(o); // java.lang.Integer
//        o = 1.2; GetType(o); // java.lang.Double
//    }
//    static void GetType(Object obj) {
//        System.out.println(obj.getClass().getName());
//    }
//}

//public class Collections {
//    public static void main(String[] args) {
//        System.out.println(Sum(1, 2));
//        System.out.println(Sum(1.0, 2));
//        System.out.println(Sum(1, 2.0));
//        System.out.println(Sum(1.2, 2.1));
//    }
//    static int Sum(int a, int b) { ...
//    }
//    static double Sum(double a, double b) { ...
//    }
//    static String Sum(String a, String b) { ...
//    }
//}

//public class Collections {
//    public static void main(String[] args) {
//        System.out.println(Sum(1, 2));
//        System.out.println(Sum(1.0, 2));
//        System.out.println(Sum(1, 2.0));
//        System.out.println(Sum(1.2, 2.1));
//    }
//    static Object Sum(Object a, Object b) {
//        if (a instanceof Double && b instanceof Double) {
//            return (Object)((Double) a + (Double) b);
//        } else if(a instanceof Integer && b instanceof Integer) {
//            return (Object)((Integer) a + (Integer) b);
//        } else return 0;
//    }
//}
//Как увеличить размер массива?
//Есть массив из 2 элементов
//

//public class Collections {
//    static int[] AddItem(int[] array, int item) {
//        int length = array.length;
//        int[] temp = new int[length + 1];
//        System.arraycopy(array, 0, temp, 0, length);
//        temp[length] = item;
//        return temp;
//    }
//    public static void main(String[] args) {
//        int[] a = new int[] { 0, 9 };
//        for (int i : a) { System.out.printf("%d ", i); }
//        a = AddItem(a, 2);
//        a = AddItem(a, 3);
//        for (int j : a) { System.out.printf("%d ", j); }
//    }
//}

// Иерархия коллекций. ArrayList
//ArrayList list = new ArrayList();
//List – пронумерованный набор элементов.
//Пользователь этого интерфейса имеет точный контроль над тем,
//где в списке вставляется каждый элемент.
//Пользователь может обращаться к элементам по их целочисленному
//индексу (позиции в списке) и искать элементы в списке.
//Разные способы создания
//ArrayList<Integer> list1 = new ArrayList<Integer>();
//ArrayList<Integer> list2 = new ArrayList<>();
//ArrayList<Integer> list3 = new ArrayList<>(10); под 10 элементов
//ArrayList<Integer> list4 = new ArrayList<>(list3);

//import java.util.ArrayList;
//import java.util.List;
//public class Collections {
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(2809);
//        list.add("string line");
//        for (Object o : list) {
//            System.out.println(o);
//            // Проблема извлечения данных
//        }
//    }
//}
//Коллекции. Функционал
//        add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
//        get(pos) – возвращает элемент из списка по указанной позиции
//        indexOf(item) – первое вхождение или -1
//        lastIndexOf(item) – последнее вхождение или -1
//        remove(pos) – удаление элемента на указанной позиции и его возвращение
//        set(int pos, T item) – gjvtoftn значение item элементу, который находится
//        на позиции pos
//        void sort(Comparator) – сортирует набор данных по правилу
//        subList(int start, int end) – получение набора данных от позиции start до end

//import java.util.Arrays;
//import java.util.List;
//public class Collections {
//    public static void main(String[] args) {
//        int day = 29;
//        int month = 9;
//        int year = 1990;
//        Integer[] date = { day, month, year };
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d); // [29, 9, 1990]
//    }
//}

//import java.util.Arrays;
//import java.util.List;
//public class Collections {
//    public static void main(String[] args) {
//        int day = 29;
//        int month = 9;
//        int year = 1990;
//        Integer[] date = { day, month, year };
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d); // [29, 9, 1990]
//    }
//}

//import java.util.Arrays;
//        import java.util.List;
//public class Collections {
//    public static void main(String[] args) {
//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder[] date = { day, month, year };
//        List<StringBuilder> d = Arrays.asList(date);
//        System.out.println(d);
//        month = new StringBuilder("09");
//        date[1] = new StringBuilder("09");
//        System.out.println(d);
//
//    }
//}
//        clear() – очистка списка
//        toString() – «конвертация» списка в строку
//        Arrays.asList – преобразует массив в список
//        containsAll(col) – проверяет включение всех элементов из col
//        removeAll(col) – удаляет элементы, имеющиеся в col
//        retainAll(col) – оставляет элементы, имеющиеся в col
//        toArray() – конвертация списка в массив Object’ов
//        toArray(type array) – конвертация списка в массив type
//        List.copyOf(col) – возвращает копию списка на основе имеющегося
//        List.of(item1, item2,...) – возвращает неизменяемый список
//
//import java.util.List;
//public class Collections {
//    public static void main(String[] args) {
//        Character value = null;
//        List<Character> list1 =
//                List.of('S', 'e', 'r', 'g', 'e', 'y');
//        System.out.println(list1);
//        // list1.remove(1); // java.lang.UnsupportedOperationException
//        List<Character> list2 = List.copyOf(list1);
//        // not null, immutable
//    }
//}

//Получение итератора с целью более гибкой работы с данными URL
//        Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
//        Enumeration в Java Collections Framework. Итераторы отличаются от
//        перечислений двумя способами:
//        Итераторы позволяют вызывающей стороне удалять элементы из
//        базовой коллекции во время итерации с четко определенной
//        семантикой.
//        hasNext(), next(), remove()
//ListIterator<E> URL
//hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)

//import java.util.*;
//public class Collections {
//    public static void main(String[] args) {
//        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
//        for (int item : list) { System.out.println(item); }
//        Iterator<Integer> col = list.iterator();
//        while (col.hasNext()) {
//            System.out.println(col.next());
//
//        }
//    }
//}

//import java.util.*;
//public class Collections {
//    public static void main(String[] args) {
//        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
//        for (int item : list) { System.out.println(item); }
//        Iterator<Integer> col = list.iterator();
//        while (col.hasNext()) {
//            //System.out.println(col.next());
//            col.next();
//            col.remove();
//        }
//    }
//}
















