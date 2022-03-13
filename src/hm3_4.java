public class hm3_4 {
    public static void main (String[] args) {
        int a = 50;
        int b = 70;
        int i;
        int j;
        int s = 0;
        int n = 0;


        for (i = a; i < b; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    s += 1;
                    if (s == 3) {
                        s = 0;
                        break;
                    }
                }
            }
            if (s == 2) {
                n += 1;
  //              System.out.println(i);
            }
            s = 0;
            if (n == 2) break;
        }

        System.out.println("второе простое число в интервале " + a + " - "+ b + " это  " + i);


    }



    }
