import java.util.Arrays;

public class hm4_5 {
    public hm4_5() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 9, 5, 2, 7, 8, 5, 9, 0};
        int a;
        int i;
        if (arr.length % 2 == 0) {
            for(i = 0; i < arr.length / 2; ++i) {
                a = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = arr[i];
                arr[i] = a;
            }
        } else {
            for(i = 0; i < (arr.length - 1) / 2; ++i) {
                a = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = arr[i];
                arr[i] = a;
            }
        }

        System.out.println("перевертыш " + Arrays.toString(arr));
    }
}
