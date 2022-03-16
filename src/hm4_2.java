import java.util.Random;

public class hm4_2 {
    public hm4_2() {
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = rand.nextInt(20);
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }
}
