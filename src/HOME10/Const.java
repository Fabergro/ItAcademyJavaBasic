package HOME10;

public class Const {

    public static void MyEx1() throws MyEx {
        System.out.println("Ошибка MyEx1");
        throw new MyEx();
    }
}
