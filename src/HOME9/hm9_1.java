package HOME9;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

// 39 списак аррайлист, удалить неудовлетворительность
public class hm9_1 {

  //  final Random random = new Random();

    public static void main(String[] args) {
        final Random random = new Random();
        ArrayList <Integer> rating = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            rating.add(random.nextInt(9) + 1);
            System.out.print(rating.get(i) + "  ");
        }
        System.out.println();
        int[] arr = new int[10];


        for (int i = 0; i < rating.size() ; i++) {
            if (rating.get(i).equals(3) || rating.get(i).equals(2) || rating.get(i).equals(1) ) {
                  arr[i] = 1;
            }
        }
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] == 1) {
                rating.remove(i);
            }
        }


        System.out.println(rating);

    }
}
