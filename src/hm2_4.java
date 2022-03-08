public class hm2_4 {

    public static void main (String[] args) {
        int d = 28;
        int m = 2;
        int y = 2020;


        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (d <= 30 && d > 0) {
                    System.out.println(++d + "." + m + "." + y);
                }
                if ( d == 31 ) {
                    System.out.println( 1 + "." + (m + 1) + "." + y);
                }
                if ( d <= 0 || d >= 32) {
                    System.out.println( " Проверить дату" );
                }
                break;
            case 2:
                if (d <= 27 && d > 0) {
                    System.out.println((d + 1) + "." + m + "." + y);
                }
                if ( d == 28 && y % 4 == 0 ) {
                    System.out.println( 29 + "." + m  + "." + y);
                }
                if ( d == 28 && y % 4 != 0 ) {
                    System.out.println( 1 + "." + (m + 1)  + "." + y);
                }
                if (d == 29 && y % 4 == 0) {
                    System.out.println( 1 + "." + ++m  + "." + y);
                }
                if (d == 29 && y % 4 != 0) {
                    System.out.println( " Проверить дату" );
                }
                if ( d <= 0 || d >= 30) {
                    System.out.println( " Проверить дату" );
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d <= 29 && d > 0) {
                    System.out.println((d + 1) + "." + m + "." + y);
                }
                if ( d == 30 ) {
                    System.out.println( 1 + "." + (m + 1) + "." + y);
                }
                if ( d <= 0 || d >= 31) {
                    System.out.println( " Проверить дату" );
                }
                break;
            case 12:
                if (d <= 30 && d > 0) {
                    System.out.println(++d + "." + m + "." + y);
                }
                if ( d == 31 ) {
                    System.out.println( 1 + "." + 1 + "." + ++y);
                }
                if ( d <= 0 || d >= 32) {
                    System.out.println( " Проверить дату" );
                }
                break;
            default:
                System.out.println( " Проверить дату" );


        }


    }
}
