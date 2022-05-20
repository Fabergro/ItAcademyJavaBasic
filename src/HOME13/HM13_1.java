package HOME13;

//55 создать метод печатающий название потока и засыпающий на 2 сек, запустить 10 потоков с синхронизацией и последовательно
public class HM13_1 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            new MyThread("Поток " + i).start();
        }
        System.out.println();
    }

}


    class MyThread extends Thread {

        MyThread(String name) {
            super(name);
        }

        @Override
        public synchronized void run() {

            //   System.out.printf("%s started... \n", Thread.currentThread().getName());
            try {
                      System.out.println("Start - " + Thread.currentThread().getName());

                    Thread.sleep(1000);

                    System.out.println("Finish - " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }

        }
    }




