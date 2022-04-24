package HOME12;

import java.util.ArrayList;
import java.util.Random;

//52 - 10 потоков, каждый считает ср арифметическое из 10 случайных целых чисел коллекции
public class hm12_1 {
    public static void main(String[] args) {

          for (int i = 1; i < 11; i++) {
            new MyThread("Поток " + i).start();
        }

    }

}

class MyThread extends Thread {

    MyThread(String name){
        super(name);
    }

    @Override
    public void run(){

        //   System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
            float sr = 0.0f;

            final Random random = new Random();
            ArrayList <Integer> arr = new ArrayList<>();

            for (int i = 0; i < 10 ; i++) {
                arr.add(random.nextInt(10000000));
            }

            for (int i = 0; i < 10; i++) {
                sr += (float) (arr.get(i) / 10);

            }
            System.out.println(Thread.currentThread().getName() + " результат " +sr);
         //       return sr;

        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
   //     System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}