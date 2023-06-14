//Лекция 04
// LinkedList -двусвязный список.
// LinkedList нужен для небольшого количества
//элементов, в которых операции добавления\удаления
//встречаются чаще операций чтения.

//import java.util.*;
//
//public class Lection04 {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        int item = queue.remove();
//        queue.add(5);
//        queue.add(28);
//        System.out.println(item);
//        System.out.println(queue);
//
//    }
//}

//public class Lection04 {
//    public static void main(String[] args) {
//        public static void main(String[] args) {
//            Queue<Integer> queue = new LinkedList<Integer>();
//            queue.add(1);
//            queue.add(2);
//            queue.add(3);
//            queue.add(4);
//            System.out.println(queue); // [1, 2, 3, 4]
//            int item = queue.remove();
//            System.out.println(queue); // [2, 3, 4]
//            queue.offer(2809);
//            item = queue.remove();
//            System.out.println(queue); // [3, 4, 2809]
//            item = queue.remove();
//            System.out.println(queue); // [4, 2809]
//            item = queue.poll();
//            System.out.println(queue); // [2809]
//        }
//    }
//
//    }
//}

//        import java.util.*;
//public class Lection04 {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        int item = queue.remove();
//        queue.offer(2809);
//        item = queue.poll();
//        System.out.println(queue);
//    }
//}

//import java.util.*;
//public class Lection04 {
//    public static void main(String[] args) {
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque = new ArrayDeque<>();
//        deque.addFirst(1); deque.addLast(2);
//        deque.removeLast(); deque.removeLast();
//        deque.offerFirst(1); deque.offerLast(2);
//        deque.pollFirst(); deque.pollLast();
//        deque.getFirst(); deque.getLast();
//        deque.peekFirst(); deque.peekLast();
//    }
//}

//import java.util.*;
//public class Lection04 {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(12);
//        stack.push(123);
//        System.out.println(stack.pop()); // 123
//        System.out.println(stack.pop()); // 12
//        System.out.println(stack.pop()); // 1
//    }
//}

import java.util.Stack;

import static java.lang.Character.isDigit;

//import java.util.*;
//public class Lection04 {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        int item = queue.remove();
//        queue.offer(2809);
//        item = queue.poll();
//        System.out.println(queue);
//        queue.remove(2809); // зачем очередь??
//        queue.element();
//        queue.peek();
//    }
//}
public  class Lection04 {
    public static void main(String[] args) {
        var exp = "1 2 3 * +".split(" "); //1+2*3
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case " + ", " - ", " * ", " / ":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println();
    }

    private static boolean isDigit(String s) {
        return false;
    }
}