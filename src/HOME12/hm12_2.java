package HOME12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//53 - создать класс потока, генерирующий массив из 10 случайных элементов, вывести максимальный с именем потока, 10 потоков
public class hm12_2 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            new MyThread1("Поток " + i ).start();

        }

    }

}

class MyThread1 extends Thread {

    MyThread1(String name){
        super(name);
    }

    @Override
    public void run(){

        //   System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(5);
            int max = 0;

            final Random random = new Random();
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < 10 ; i++) {
                arr.add(random.nextInt(1000));
  //              System.out.print(Thread.currentThread().getName() + " " + arr.get(i) + "; ");
            }
            max = arr.get(0);
            for (int i = 1; i < 10; i++) {
                if (arr.get(i) > max) {
                    max = arr.get(i);
                }


            }
            System.out.println(Thread.currentThread().getName() + " максимальное значение " + max );
            //       return sr;

        }
        catch(InterruptedException e){
            System.out.println("Нет потока");
        }
        //     System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
