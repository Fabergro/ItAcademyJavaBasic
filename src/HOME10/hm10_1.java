package HOME10;

//43 - обработчик NullPointerExeption
public class hm10_1 {
    public static void main(String[] args) {

        String a = null;

        try {
            int b = a.length();

        } catch (NullPointerException e) {
            System.out.println("Ошибка NullPointerExeption");
            System.out.println(e);
        }

    }
}
