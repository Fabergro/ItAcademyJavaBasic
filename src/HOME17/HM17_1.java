package HOME17;
import  java.lang.reflect.*;
//70 - c помощью рефлекции распечатать информацию о классе
public class HM17_1 {
    public static void main(String[] args) {

        Class<Man> manClass = Man.class;
        Field[] declaredFields = manClass.getDeclaredFields();
        for (Field field :declaredFields) {
            System.out.println(field);
        }
        System.out.println();
        Method[] methods = manClass.getDeclaredMethods();
        for (Method method : manClass.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}

 class Man {
    private final String name;
    private final String surname;
    private final int age;



    Man(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //    public static Field[] getDeclaredFields() {
    //    }

    String name() { return name; }
    String surname() { return surname; }
    int age() { return age; }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private int getAge() {
        return age;
    }

    public String toString() {
        return String.format("[name=%s, surname=%s, age=%d]", name, surname, age);
    }


}



