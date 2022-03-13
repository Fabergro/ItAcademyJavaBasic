public class hm3_1 {

    public static void main (String[] args) {
        int a = 10;
        int i = 1;
        int j = 1;
        long f = 1L;

        System.out.println("0!=1");

        while (i <= a) {
            while (j <= i) {
                f *= j;
               j++;
            }
            System.out.println((j-1) + "!=" + f);
            j = 1;
            f = 1L;
            i++;
        }




    }
}
