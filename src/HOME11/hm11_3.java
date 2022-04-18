package HOME11;


import  java.io.*;
import java.util.regex.*;
import java.util.ArrayList;

//48 - файл с числами, вывести их,  найти их сумму, удалить повторяющиеся и опять вывод на экран
public class hm11_3 {
    public static void main(String[] args) throws Exception {

        BufferedReader in;
        int s = 0;
        int s1 = 0;
        int s2 = 0;
        ArrayList <Integer> arr = new ArrayList<>();

        try {
            in = new BufferedReader(new FileReader("48.txt"));
            String str = in.readLine();
            String str1 = str;

            while ( str != null) {

                System.out.println(str);

                Pattern p = Pattern.compile("\\d{1,}");
                Matcher m = p.matcher(str);
                while (m.find()) {
                    s++;
 //                   System.out.println(str.substring(m.start(), m.end()));
                    arr.add(Integer.valueOf (str.substring(m.start(), m.end())));
                }
/*
                if (s > 0) {
                    System.out.println("В файле чисел - " + s + " шт");
                } else {
                    System.out.println("В файле нет чисел");
                }

 */
                s = 0;
                str = in.readLine();
            }


            System.out.println(arr);

            for (int i = 0; i < arr.size(); i++) {
                s1 += arr.get(i);
            }

            System.out.println("Сумма цифр равна " + s1);

            s1 = arr.size();
            int[] arr1 = new int[s1];

            for (int i = 0; i < s1; i++) {

                for (int j = i + 1; j < s1; j++) {
                    if (arr.get(i).equals(arr.get(j))) {
                        arr1[j] = 1;
                    //    arr1[i] = 1;
                    }

                }
            }

            for (int j = s1 - 1; j >= 0 ; j--) {
                if (arr1[j] == 1) {
                    arr.remove(j);
                  }
            }
                System.out.println(arr);

            for (int i = 0; i < arr.size(); i++) {
                s2 += arr.get(i);
            }

            System.out.println("Сумма цифр после удаления всех повторяющихся равна " + s2);

        } catch (FileNotFoundException e) {
            System.out.println("Нет файла");
        }

    }

}
 