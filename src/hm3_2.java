public class hm3_2 {
    public static void main (String[] args) {
        int a = 25;
        int i = 1;
        long f = 1L;

        do {
            f *= i;
            i++;

        } while (i <= a);
        System.out.println("25!="+ f);



    }
}
