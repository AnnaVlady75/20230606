package DZ_java;

//Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class DZ02 {
    public static void main(String[] args) {
        String sql_request = "select * from students where ";
        StringBuilder new_str = new StringBuilder();
        new_str.append(sql_request);
        String json_str = "{\"name\":\"Ivanov\", " +
                "\"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String json_string = json_str
                .replace("\"", "")
                .replace("{", "")
                .replace("}", "")
                .replace(":", ",")
                .replace(" ", "");
        //System.out.println(json_string);

        String[] arr = json_string.split(",");
        for (String i : arr){}
        for (int i = 0; i < arr.length; i += 2) {
            if (!arr[i + 1].equals("null")) {
                if (i > 0) {
                    if (!arr[i - 1].equals("null")) {
                        new_str.append(" and ");
                    }
                }
                new_str.append(arr[i]);
                new_str.append(" = ");
                new_str.append("'");
                new_str.append(arr[i + 1]);
                new_str.append("'");
            }
        }
        String res_string = new String(new_str);
        System.out.println(res_string);
    }
}
