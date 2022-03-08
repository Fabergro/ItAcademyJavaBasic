public class hm2_1 {

    public static void main (String[] args) {

        System.out.println(getSeven(18));

    }
    private static Boolean getSeven (int a) {

        if (a % 10 == 7) {
            return true;
        }
        else  {
            return false;
        }

    }
}
