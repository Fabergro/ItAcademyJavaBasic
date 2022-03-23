package HOME6;
//шестнадцаричных чисел поиск
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hm6_4 {
    public static void main(String[] args) {

        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();


        Pattern p = Pattern.compile("[0-H]");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(str.substring(m.start(), m.end()));
        }
    }
}
