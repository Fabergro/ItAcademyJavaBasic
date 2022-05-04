package HOME17;

import java.lang.reflect.*;
//71 - вызвать метод с помощью рефлексии
public class HM17_2 {
    public static void main(String[] args) {

        Class<Man1> manClass = Man1.class;
        Field[] declaredFields = manClass.getDeclaredFields();
        for (Field field :declaredFields) {
            System.out.println(field);
        }

        System.out.println();
        Method[] methods = manClass.getDeclaredMethods();
        for (Method method : manClass.getDeclaredMethods()) {
                System.out.println(method);
        }
        System.out.println();
        try {
            Method method1 = manClass.getDeclaredMethod("printHelloWorld");
            method1.setAccessible(true);
            method1.invoke(null);
        }
        catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Man1 {

    Man1() {

    }

    public static void printHelloWorld() {
        System.out.println("Hello World");;
    }


}
