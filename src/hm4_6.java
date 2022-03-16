public class hm4_6 {
    public hm4_6() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }

    }
}
