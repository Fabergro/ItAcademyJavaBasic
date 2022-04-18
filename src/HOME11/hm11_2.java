package HOME11;

//47 - создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов. Вывести результат на экран.
import  java.io.*;
import java.util.regex.*;
public class hm11_2 {
    public static void main(String[] args) throws Exception{

        BufferedReader in;
        int s = 0;
        int pr = 0;
        int w = 0;

        try {
            in = new BufferedReader(new FileReader("47.txt"));
            String str = in.readLine();
            String str1 = str;

             while ( str != null) {

                 System.out.println(str);
                 //           str1 = str;
                 str = in.readLine();


                 Pattern p = Pattern.compile("\\p{P}");
                 Matcher m = p.matcher(str1);
                 while (m.find()) {
                     s++;
                 }

                 if (s > 0) {
                     pr = pr + s;
                 }
                  s = 0;
                 str1 = str1.trim();

                 str1.replaceAll("\\p{P}", "");


                 Pattern pat = Pattern.compile(" +");
                 String[] words = pat.split(str1);

                 if (words.length > 0) {
                      w = w + words.length;
                 }
              }
            System.out.println("В файле слов " + w);
            System.out.println("В файле знаков препинания - " + pr + " шт");

        } catch (FileNotFoundException e) {
            System.out.println("Нет файла");
        }

    }
}
