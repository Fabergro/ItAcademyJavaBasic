package HOME9;
//40 - коллекция, удалить повторы (взял случайные от 0 до 20)

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class hm9_2 {
    public static void main(String[] args) {

        final Random random = new Random();
        ArrayList <Integer> rating = new ArrayList<>();

        for (int i = 0; i < 15 ; i++) {
            rating.add(random.nextInt(21));
            System.out.print(rating.get(i) + "  ");
        }
        System.out.println();


        int[] arr = new int[16];
        int b = rating.size();
        int bb = arr.length;


        for (int i = 0; i < b ; i++) {

            for (int j = 0; j < 16; j++) {
                arr[j] = 0;
            }

            for (int j = i + 1; j < b; j++) {
                if (rating.get(i).equals(rating.get(j))) {
                    arr[j] = 1;
                    arr[i] = 1;
                }
              }
             for (int j = bb - 1; j >= 0 ; j--) {
                if (arr[j] == 1) {
                    rating.remove(j);
                    i = 0;
                    b--;
                }
            }
            bb = b;

        }



        System.out.println(rating);

    }
}
