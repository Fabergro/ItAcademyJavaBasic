package HOME5;
// банкомат
import java.util.Arrays;
import java.util.Scanner;

public class hm5_2 {

    int amountTwenty = 0;
    int amountFifty = 0;
    int amountHundred = 0;
    static int[] arr = {0,0,0};

    public static void main(String[] args) {

     int[][] arr1 = {{0,0,0},{0,0,0}};
     int n1 = 0;
     int n2 = 0;
     int n3 = 0;

        System.out.println("Введите сумму: ");
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();

        System.out.println("Введите количество купюр номиналом 20, 50, 100: ");
        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }
     //   System.out.println("Введите сумму");

     //    System.out.println(Arrays.toString(arr));

     // проверка нам возможность выдачи - меньше мин и больше макс
        if ((sum < 20) || sum > (arr[0] * 20 + arr[1] * 50 + arr[2] * 100)) {
            System.out.println("Выдать невозможно");
            return;
        }
        //возможность получения суммы наличными

        if ((sum % 20 == 0) && (sum >= 20)) {arr1[0][0] = sum / 20;}
        else {arr1[1][0] = sum / 20;}
        if ((sum % 50 == 0) && (sum >= 50)) {arr1[0][1] = sum / 50;}
        else {arr1[1][1] = sum / 50;}
        if ((sum % 100 == 0) && (sum >= 100)) {arr1[0][2] = sum / 100;}
        else {arr1[1][2] = sum / 100;}

  //      System.out.println(Arrays.deepToString(arr1));

        //что меньше - сумма деленная на номинал или количество купюр

        if (sum / 20 <= arr[0] ) { n1 = sum / 20; }
        else {n1 = arr[0];}
        if (sum / 20 <= arr[1] ) { n2 = sum / 20; }
        else {n2 = arr[1];}
        if (sum / 20 <= arr[2]) { n3 = sum / 20; }
        else {n3 = arr[2];}

        //перебор

        for (int i = 0; i <= n1 ; i++) {
            for (int j = 0; j <= n2; j++) {
                for (int k = 0; k <= n3; k++) {

                    if (sum == i * 20 + j * 50 + k * 100) {
                        System.out.println("Возможна выдача суммы " + sum + " = 20 * " + i + " + 50 * " + j + " + 100 * " + k);
                        ofATM(i, j, k);
                        System.out.println("Остаток купюр в банкомате: \n20 - " + arr[0] + "\n50 - " + arr[1] + "\n100 - " + arr[2]);
                        return;
                    }

                }

            }

        }

        System.out.println("Выдать невозможно");

    }

        private static int[] inATM(int a, int b, int c) {

        arr[0] += a;
        arr[1] += b;
        arr[2] += c;


        return arr;
        }

        private static int[] ofATM(int a, int b, int c ) {

            arr[0] -= a;
            arr[1] -= b;
            arr[2] -= c;

            return arr;

        }



}
