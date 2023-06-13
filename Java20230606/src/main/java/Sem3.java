import java.util.*;

public class Sem3 {
    public static void main(String[] args) {
        //List list = new ArrayList(); //интерфейс, нет реализации
        //Object o = new Object();//корневой объект

        //ArrayList list = new ArrayList<>();

//        list.add(1);//добавление 1 Integer
//        list.add(.24f);// Float
//        list.add("Привет!");//String
//        list.add(true);//Boolean
//
//        if (list.get(2) instanceof String){//проверяет, строка ли
//            String s = (String) list.get(2);
//        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
            list2.add(new Random().nextInt(15));
//
////            list.add(12);//добавляет число в конец списка
////            list.add(1,12);//в индекс 1 запишется 12
////            list.addAll(list2);//все элементы одного в другой массив
////            list.addAll(2,list2);//в какой индекс
////            list.set(2,12);// у индекса 2 меняем значение на 12 , изменение эл по индексу
////
////            list.size();// возвращает размер, сколько элементов в списке
////            if(list.contains(12));// есть ли число 12
////            list.remove(12);//удаление элемента индекса 12
////            Integer in = 12;
////            list.remove(in);// удаляет объект по значению
////            list.clear();//чистка массива, удаляет ссылки
////           // list.subList();//выбирает из листа подлист с какого по какой индекс
////            List<Integer> integer = list.subList(1,list.size()/2);
////            ArrayList<Integer> integers = (ArrayList<Integer>) list.subList(1,list.size()/1);
////            list.trimToSize(); //обрезка массива, уменшает размер массива до size
////            list.ensureCapacity(100);// работа со внутр массивом, если нужно уменьшить память
////            list.indexOf(12);//ищет индекс элемента слева
////            list.lastIndexOf(12);// сконца, справа
////            //list.equals();// равен ли он другому объекту
////
            System.out.println(list);
            System.out.println(list2);
//            System.out.println(" - ".repeat(16));
//
//            list.retainAll(list2);//есть ли в списке, если нет - удаляет, есть  - оставляет
//
//
//            list.retainAll(list2);
//            list.sort(Comparator.naturalOrder());//по возрастанию
//            list.sort(Comparator.reverseOrder());// с большего к меньшему
////            list.sort(new Comparator<Integer>() {
////                @Override
////                public int compare(Integer o1, Integer o2) {
////                    if (o1 % 3 ! = 0) return 0;
////                    if (o2 % 2 == 0) return 1;
////                    return -1;
////                    return 01 - o2;
////                }
////            });
//
//
//            System.out.println(list);
//
//            for (int j = 0; j < list.size(); j++) {
//                System.out.println(list.get(j));
//            }
//
//            for (int k : list) {// к в листе
//                System.out.println(k);
//            }
//
//            Iterator<Integer> iterator = list.iterator();
//            while (iterator.hasNext()) {//есть ли еще данные в итераторе
//                int g = iterator.next();// возвращает след элемент
//                iterator.remove();// удадяет элемент
//            }
//            ListIterator<Integer> iterator1 = list.listIterator();
//            while (iterator1.hasPrevious()) {
//                int i1 = iterator1.previous();
//                iterator1.remove();
//                iterator1.nextIndex();
//
//            }
//            list2.clear();
//            list.forEach(n->list2.add(0,n));//разворот списка
//
//            list.forEach(n -> System.out.println(n));

//        }
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(12);
        integers.add(0,12);

        }
    }
}
