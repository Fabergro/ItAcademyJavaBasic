public class hm2_3 {

    public static void main (String[] args) {

        int a = 12;

        if ( a%100==11 || a%100==12 || a%100==13 || a%100==14 || a%100==15 ||  a%100==17 || a%100==18 || a%100==19) {
            System.out.println( a + " рублей");
        }
        else {
            switch ( a % 10) {
                case 1:
                    System.out.println( a + " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println( a + " рубля");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    System.out.println( a + " рублей");
                    break;



            }




        }


    }
}
