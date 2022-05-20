package HOME13;

import java.util.Random;

//57 - задача про потребителей и производителей
public class HOME13_3 {
    public static void main(String[] args) {
        int summaElement = 200;
        int element = 0;
  //      System.out.println();
        while (summaElement <= 5000) {
            (new Thread(new MyThreadGet("Производитель 1", element))).run();
            summaElement += 100;
            (new Thread(new MyThreadSet("Потребитель 1", element))).run();
            (new Thread(new MyThreadGet("Производитель 2", element))).run();
            summaElement += 100;
            (new Thread(new MyThreadSet("Потребитель 2", element))).run();
            (new Thread(new MyThreadGet("Производитель 3", element))).run();
            summaElement += 100;
        }

    }
}

class MyThreadGet implements Runnable  {
    private  String name;
    public   int element;
    private  int nextElement;

    MyThreadGet (String name, int element) {
        this.name = name;
        this.element = element;
    }

    public  int getElement() {
        return  element;
    }

    public  int getNextElement() {
        return nextElement;
    }

 /*     @Override
    public String getName() {
        return name;
    }
*/
    @Override
    public void run() {
        synchronized (this) {
            try {
                if (getElement() >= 100) {
                    System.out.println("Производитель " + Thread.currentThread().getName() + " спит");
                    Thread.sleep(500);
                }
                if (getElement() <= 80) {
                    final Random random = new Random();
                    nextElement = random.nextInt(101);
                    element += nextElement;
                    System.out.println("Производитель " + Thread.currentThread().getName() + " добавил " + nextElement + " элементов");
                }

                System.out.println(Thread.currentThread().getName() + " *****" + getElement());

            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }

        }
    }


}

class MyThreadSet implements Runnable  {
    private  String name;
    private  int element;
    private  int nextElement;

    MyThreadSet (String name, int element) {
        this.name = name;
        this.element = element;
    }

    public  int getElement() {
        return  element;
    }

    public  int getNextElement() {
        return nextElement;
    }


    @Override
    public void run() {

        synchronized (this) {

            try {
                if (getElement() <= 80) {
                    System.out.println("Потребитель " + Thread.currentThread().getName() + " спит");
                    Thread.sleep(500);
                }
                if (getElement() >= 0) {
                    final Random random = new Random();
                    nextElement = random.nextInt(101);
                    if (getElement() - nextElement > 0) {
                        element -= nextElement;
                        System.out.println("Потребитель " + Thread.currentThread().getName() + " взял " + nextElement + " элементов");
                    } else {
                        element = 0;
                        System.out.println("Потребитель " + Thread.currentThread().getName() + " взял " + element + " элементов");
                    }
                }

            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }

    }


}


