package HOME6;
// слов в тексте
import java.util.Scanner;
import java.util.regex.Pattern;

public class hm6_2 {
    public static void main(String[] args) {

        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        str = str.trim();

        Pattern pat = Pattern.compile(" +");
        String[] words = pat.split(str);

        for(String word:words)
            System.out.println(word);

           System.out.println(words.length);
    }
}
