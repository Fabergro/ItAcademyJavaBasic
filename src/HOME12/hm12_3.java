package HOME12;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

//54 - поток, записывающий в файл 10 случайных чисел, создать 5 потоков
public class hm12_3 {
    public static void main(String[] args) {


     for (int i = 1; i < 6; i++) {
        new MyThread2("поток" + i ).start();

     }
        System.out.println("Уcё");
    }

}

class MyThread2 extends Thread  {

    MyThread2(String name){
        super(name);
    }

    @Override
    public void run(){

        try{
            Thread.sleep(5);

            String trm = "c:\\Users\\kirill\\IdeaProjects\\HM\\";
            File f = new File(trm);
            if (!f.isDirectory()) {
                f.mkdirs();
            }

            File f1 = new File(trm + "Имя-" + Thread.currentThread().getName() + ".txt");
            if (!f1.exists()) {
                try {
                    boolean created = f1.createNewFile();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }


            try {

                final Random random = new Random();
                BufferedWriter f2 = new BufferedWriter(new FileWriter(trm + "Имя-" + Thread.currentThread().getName() + ".txt"));

                for (int i = 0; i < 10; i++) {
                    String s11 = Integer.toString(random.nextInt(1000000));
                    f2.append(s11);
                    f2.append(';');
                }
                f2.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }




        }
        catch(InterruptedException e){
            System.out.println("Нет потока");
        }
        //     System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}


