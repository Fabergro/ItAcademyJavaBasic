package HOME7;

public class TV extends Home1 implements Onn {

        public TV(String name) {
            super(name);
        }

        public void on() {
            System.out.println(name + " включен в розетку");
        }

    public void off() {
        System.out.println(name + " выключен из розетки");
    }

}
