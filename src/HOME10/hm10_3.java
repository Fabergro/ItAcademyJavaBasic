package HOME10;

//45 - исключение с обработкой на уровень выше
public class hm10_3 {

    public static void main(String[] args) {

        try {
            Const.MyEx1();
        } catch (MyEx e) {
            System.out.println(e);
        }

    }
}
