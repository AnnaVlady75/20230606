import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        for (int j = 0; j < 1001; j++) {
            int count = 0;
            for (int k = 1; k <= j; k++) {
                if (j % k == 0) count += 1;
            }
            if (count <= 2) System.out.println(j);

        }
    }
}
//        System.out.print("Введите первое число: ");
//        String first = scanner.nextLine();
//        System.out.print("Введите второе число: ");
//        String second = scanner.nextLine();
//        System.out.print("Введите действие: ");
//        String word = scanner.nextLine();
//        switch (word){
//            case "+":
//                int tmp = Integer.parseInt(first) + Integer.parseInt(second);
//                System.out.println(tmp);
//                break;
//            case "-":
//                tmp = Integer.parseInt(first) - Integer.parseInt(second);
//                System.out.println(tmp);
//                break;
//            case "*":
//                tmp = Integer.parseInt(first) * Integer.parseInt(second);
//                System.out.println(tmp);
//                break;
//            case "/":
//                tmp = Integer.parseInt(first) / Integer.parseInt(second);
//                System.out.println(tmp);
//                break;
//            case "tbs":
//                System.out.println(Integer.toBinaryString(Integer.parseInt(second)));
//                break;
//            default:
//                System.out.println("Действие не поддерживается");
//
//            }
//        }
//    }
