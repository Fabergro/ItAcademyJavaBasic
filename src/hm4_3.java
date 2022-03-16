public class hm4_3 {
    public hm4_3() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 12, 5, 7, 6, 9, 12, 6, 7};
        int a = arr[0];

        int i;
        for(i = 1; i < arr.length; ++i) {
            if (a <= arr[i]) {
                a = arr[i];
            }
        }

        for(i = 0; i < arr.length - 1; ++i) {
            if (a == arr[i]) {
                System.out.println(i);
            }
        }

    }
}
