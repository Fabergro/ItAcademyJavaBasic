public class hm3_3 {
    public static void main (String[] args) {
        long a = 7893823445L;
        long i = 1;
        int s = 0;

        do {
            i = a % 10;
            s += i;
            a = a / 10;

        } while (a >= 1);
        System.out.println("сумма цифр числа 7893823445 = "+ s);



    }
}
