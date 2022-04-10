package HOME9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//41 - самая высокая оценка с помощью итератора
public class hm9_3 {

    public static void main(String[] args) {


        final Random random = new Random();
        ArrayList<Integer> rating = new ArrayList<>();
  //      Iterator<Integer> it = rating.iterator();

        for (int i = 0; i < 15; i++) {
            rating.add(random.nextInt(50) + 1);
            System.out.print(rating.get(i) + "  ");
        }
        System.out.println();

        Iterator<Integer> it = rating.iterator();
        int a = 0;
        int b = 0;

        while (it.hasNext()) {
              a =  it.next();
         if (b < a) {
             b = a;
  //           System.out.print(a + "************");
         }

        }
        System.out.println("Максимальная оценка " + b);

    }
}
