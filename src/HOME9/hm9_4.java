package HOME9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

//42 - создать коллекцию Мар, ключ - слово, значение - количество его повторения
public class hm9_4 {

    public static void main(String[] args) {

        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        str = str.trim();

        Pattern pat = Pattern.compile(" +");
        String[] words = pat.split(str);

        Map<String, Integer> map = new HashMap<>();
        int a = 0;

        for(String word:words) {

            if (map.isEmpty()) {
                map.put(word, 1);
                continue;
            }

            if (map.get(word) == null) {
                map.put(word, 1);
            }
            else {
                a = map.get(word);
                a++;
                map.put(word, a);
            }



         }

        System.out.println(map.toString());
    }



}
