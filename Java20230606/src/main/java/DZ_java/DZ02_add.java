package DZ_java;
//Дана json-строка (можно сохранить в файл и читать из файла)
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4",
//        "предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод(ы), который распарсит json и, используя StringBuilder,
//        создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.
//
//        *Сравнить время выполнения замены символа "а" на "А"
//        любой строки содержащей >1000 символов средствами String и StringBuilder.
//        *Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.

//import java.util.Arrays;
//
//public class DZ02_add {
//    public static void main(String[] args) {
//        String[] json_string = new String[]{"{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}",
//                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}",
//                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}"};
//        System.out.println(Arrays.toString(json_string));
//
//    }
//}
