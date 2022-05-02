package HOME15;

import java.sql.Array;
import java.util.Arrays;
//61 - для всех чктных значений 1 до 20 дюймов - печать значений в дюймах, см, сумма в см

public class HM15_1 {
    public static void main(String[] args) {

        Integer[] arr = new Integer[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Все четные значения в дюймах");
        Arrays.stream(arr)
                .filter(s -> s % 2 == 0 )
                .forEach(s -> System.out.print(s + "  "));

        System.out.println();
        System.out.println("Все четные значения в сантиметрах");
        Arrays.stream(arr)
                .forEach(s -> System.out.print(s * 2.54 + "  "));

        System.out.println();
        System.out.println("Сумма всех четных значений в сантиметрах");
        double sum = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2.54)
                .reduce((x,y) -> x + y)
                .get();
        System.out.println(sum);


    }


}
