package HOME11;

// 49 - в двоичный файл записать 20 случайных чисел, прочитать его, вывод чисел и их ср.арифметическое
import  java.io.*;
import java.util.ArrayList;
import java.util.Random;

import java.nio.file.Path;
import java.util.regex.*;

public class hm11_4 {
    public static void main(String[] args) throws Exception {

        int s1 = 0;
        File f = new File("c:\\Users\\kirill\\IdeaProjects\\HM\\a.txt");

        if (!f.exists()) {
            try {
                boolean created = f.createNewFile();
                //         if (created)
                //              System.out.println("File has been created");
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }

        final Random random = new Random();
         BufferedWriter f1 = new BufferedWriter(new FileWriter("c:\\Users\\kirill\\IdeaProjects\\HM\\a.txt"));

        for (int i = 0; i < 20; i++) {

            final String s = Integer.toString(random.nextInt(1000));

            f1.append(s);
       //     System.out.print(s);
            f1.append(';');
            //       f1.append((char) 50);
        }
        f1.close();
        //   f1.append("sfgsg");
        //   f1.write(105);

  /*      try(BufferedReader br = new BufferedReader (new FileReader("c:\\Users\\kirill\\IdeaProjects\\HM\\a.txt")))
        {
            // чтение посимвольно
            int c;
            while((c=br.read())!=-1){

                System.out.print((char)c + "    ");
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
*/


        ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader in;
        in = new BufferedReader(new FileReader("c:\\Users\\kirill\\IdeaProjects\\HM\\a.txt"));
        String str = in.readLine();


        Pattern p = Pattern.compile("\\d{1,}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            s1++;
            //                   System.out.println(str.substring(m.start(), m.end()));
            arr.add(Integer.valueOf (str.substring(m.start(), m.end())));
        }
        System.out.println();
        System.out.println(arr);

        s1 = arr.size();
        int sr = 0;
        for (int i = 0; i < s1; i++) {
            sr += arr.get(i);
        }
        System.out.println("Среднее арифметическое " + (double) sr / s1);

    }

}

