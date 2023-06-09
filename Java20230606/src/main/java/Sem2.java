import java.util.Random;

//public class Sem2 {
//    static String s;
//    public static void main(String[] args) {
//       // String s = "Hello!";
//        String s1 = new String("Hello!");
//
//       // System.out.println(s.equals(s1));
//        System.out.println(s);
//        int a = new Random().nextInt(80)+20;
//    }
//}public class Sem2 {
//  public static void main(String[] args) {
//        Integer.numberOfTrailingZeros(564); //после старшего бита возвращает 0
//        Integer.numberOfTrailingZeros(34); // 00 до старшего бита
//    }
//}
//CTRL
public class Sem2 {
    public static void main(String[] args) {
        String str = "Hello World ! ";

        str.getBytes();//возвращает массив,
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        if (str.isEmpty());
        if (str.length()==0);

        System.out.println(str.charAt(str.length() / 2));// буква по индексу
        System.out.println(str.indexOf('!'));
        System.out.println(str.indexOf("o!"));
        System.out.println(str.indexOf("!", str.indexOf("!") + 1));
        System.out.println(str.lastIndexOf("!"));
        System.out.println(str.lastIndexOf("!", str.lastIndexOf("!") - 1));
        System.out.println(str.endsWith("! "));// на что, возвращается строка
        System.out.println(str.equals("!"));//сравнение
        System.out.println(str.contains("!"));// содержит ли
        System.out.println("-".repeat(32));
        System.out.println(str.repeat(4).replace("!", "?"));
        System.out.println(str.repeat(4).replace("!", ""));
        System.out.println(str.repeat(4).replaceFirst("!", "<?>"));

        System.out.println(str.substring(str.length() / 2));
        System.out.println(str.substring(str.length() / 2, str.length() - 1));
        String[] tmp = str.repeat(4).split(" ");
        System.out.println(str.concat("!"));//+
        System.out.println(tmp);

        System.out.println(str);

        StringBuilder builder = new StringBuilder("Hello World ! ");
        builder = new StringBuilder(32);
        builder = new StringBuilder(); //массив 16
        builder = new StringBuilder(str);

        builder
                .append(.4327f)//дробное
                .append("!")
                .append(true);
        builder.deleteCharAt(builder.length() / 2);
        builder.delete(0, builder.length() / 2);
        builder.insert(0, "Привет ");
        builder.replace(2, 4, "!!!");//с какого по какой и чем заменить
        builder.reverse();//разворачивает строку
        builder.charAt(builder.length() / 2);
        builder.indexOf("!");
        builder.indexOf("!", builder.indexOf("!") + 1);
        builder.lastIndexOf("!");
        builder.indexOf("!", builder.indexOf("!") - 1);

        str = builder.toString();
        str = new StringBuilder(str).reverse().toString();

        System.out.println(builder);
        //строка не сохраняет пред строку

        String s = "";
        StringBuilder builder1 = new StringBuilder("");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            s += Character.getName(i);
        }
        System.out.println("String time =" + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            builder1.append(Character.getName(i));
        }
        System.out.println("StringBuilder time = " + (System.currentTimeMillis() - start));
    }
}


