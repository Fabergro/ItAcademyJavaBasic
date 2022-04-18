package HOME10;

//44 - собственное исключение от Exeption
public class hm10_2 {

    public static void main(String[] args) {
        int a = 0;

        try {
            if (a == 0)
                throw new WithoutZero();
        }
        catch (WithoutZero e) {
            System.out.println(e.toString());
        }

    }


}
class WithoutZero extends Exception {
    public String toString() {
        return "Ошибка. Без нуля.";
    }
}
