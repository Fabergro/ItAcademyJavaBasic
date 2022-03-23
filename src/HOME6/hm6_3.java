package HOME6;
//слово из последних букв
import java.util.Scanner;
import java.util.regex.Pattern;

public class hm6_3 {
    public static void main(String[] args) {
        StringBuffer w = new StringBuffer("");

        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        str = str.trim();

        Pattern pat = Pattern.compile(" +");
        String[] words = pat.split(str);

        for(String word:words) {
            w.append(word.charAt(word.length() - 1));
        }

        System.out.println(w);
    }

}
