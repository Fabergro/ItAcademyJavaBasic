public class hm4_4 {
    public hm4_4() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 9, 5, 2, 7, 8, 5, 9, 1};
        int min = getMin(arr);
        int max = getMax(arr);
        int difIndex = 0;
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;

        int i;
        for(i = 0; i < arr.length; ++i) {
            if (min == arr[i]) {
                for(int j = 0; j < arr.length; ++j) {
                    if (max == arr[j] && difIndex < Math.abs(i - j)) {
                        difIndex = Math.abs(i - j);
                        minIndex = i;
                        maxIndex = j;
                    }
                }
            }
        }

        if (maxIndex > minIndex) {
            for(i = minIndex + 1; i < maxIndex; ++i) {
                sum += arr[i];
            }
        } else {
            for(i = maxIndex + 1; i < minIndex; ++i) {
                sum += arr[i];
            }
        }

        System.out.println("сумма " + sum);
    }

    private static int getMin(int[] sr) {
        int a = sr[0];

        for(int i = 1; i < sr.length; ++i) {
            if (a > sr[i]) {
                a = sr[i];
            }
        }

        return a;
    }

    private static int getMax(int[] sr) {
        int a = sr[0];

        for(int i = 1; i < sr.length; ++i) {
            if (a < sr[i]) {
                a = sr[i];
            }
        }

        return a;
    }
}
