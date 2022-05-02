package HOME15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

//63 - list коллекция из n целых чисел от minValue до maxValue. C помощью stream определить числа, делящиеся на 3 и на 5
public class HM15_3 {
    public static void main(String[] args) {

        int n = 35;
        int minValue = 10;
        int maxValue = 500;

        final Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        //      Iterator<Integer> it = rating.iterator();

        for (int i = 0; i < n; i++) {
            arr.add(random.nextInt(maxValue - minValue) + minValue);
            System.out.print(arr.get(i) + "  ");
        }
        System.out.println();

        Stream stream = arr.stream();
        //    minValue = (Integer) stream.min(arr::com).get();
        //    String max = arr.stream().max(String::compareTo).get()

        Optional<Integer> max = arr.stream().max(Integer::compareTo);
        Optional<Integer> min = arr.stream().min(Integer::compareTo);

        minValue = (Integer) min.get();
        maxValue = (Integer) max.get();

        System.out.println("минимум " + minValue);
        System.out.println("максимум " + maxValue);

        System.out.print("Числа, делящиеся на 3 и на 5: ");
        arr.stream()
                .filter(s -> s % 3 == 0 )
                .filter(s -> s % 5 == 0)
                .forEach(s -> {
                    if (s != 0) {
                        System.out.print(s + "  ");}
                    else {
                        System.out.println("нету");}
                });


        if (arr.stream()
                .filter(s -> s % 3 == 0 )
                .noneMatch(s -> s % 5 == 0)) {
            System.out.println("нету");
        }

    }
}
