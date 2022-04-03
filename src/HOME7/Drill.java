package HOME7;

public class Drill extends Home1 implements Onn {

        public Drill (String name) {
            super(name);
        }

        public void on() {
            System.out.println(name + " включен в розетку");
        }

        public void off() {
            System.out.println(name + " выключен из розетки");
        }



}
