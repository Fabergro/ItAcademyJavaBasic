package HOME6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// поиск знаков препинания
public class hm6_1 {
    public static void main(String[] args) {

        int s = 0;

        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Pattern p = Pattern.compile("\\p{P}");
        Matcher m = p.matcher(str);
       while (m.find()) {
               s++;
            }

        if (s > 0) {
            System.out.println("В строке знаков препинания - " + s + " шт");
        }
        else {
            System.out.println("В строке нет знаков препинания");
        }

    }
}
