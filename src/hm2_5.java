public class hm2_5 {
    public static void main (String[] args) {
        int a = 10;
        int b = 5;
        int c = 1;
        int d = 5;
        int e = 12;
        int f = 5;
        int i = 0;

        if (a + c <= f && b <= e && d <= e) {
            ++i;         }
        if (a + d <= f && b <= e && c <= e) {
            ++i;         }
        if (a + c <= e && b <= f && d <= f) {
            ++i;         }
        if (a + d <= e && b <= f && c <= f) {
            ++i;         }

        if (b + c <= f && a <= e && d <= e) {
            ++i;         }
        if (b + d <= f && a <= e && c <= e) {
            ++i;         }
        if (b + c <= e && a <= f && d <= f) {
            ++i;         }
        if (b + d <= e && a <= f && c <= f) {
            ++i;         }

        if (i >= 0) {
            System.out.println("Строительство возможно (" + i + " вариант)");
        }
        else {
            System.out.println("Строительство невозможно");
        }
    }
}
