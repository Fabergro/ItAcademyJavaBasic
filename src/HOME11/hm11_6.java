package HOME11;

//51 - обьект с полямиname, surname, age, 10 обьектов, перемешать и в файл
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class hm11_6 {
    public static void main(String[] args) throws Exception {
        String[] n = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"  };
        String[] sur = {"Ivanov", "Petrov", "Sidorov", "Begunov", "Bystrov", "Sturov", "Voinov", "Krylov", "Antonov", "Migov"  };
        final Random random = new Random();
        Person a = new Person();

        BufferedWriter f1 = new BufferedWriter(new FileWriter("c:\\Users\\kirill\\IdeaProjects\\HM\\a1.txt"));


        shuffleArray(n);
        shuffleArray(sur);

        for (int i = 0; i < 10; i++) {
            a.setAge(random.nextInt(100) + 1);

     //       Optional<String> ob = Arrays.stream(n).findAny();
            a.setName(n[i]);
     //       Optional<String> ob1 = Arrays.stream(sur).findAny();
            a.setSurname(sur[i]);

            f1.append(a.getName());
            f1.append(".");
            f1.append(a.getSurname());
            f1.append("-");
            f1.append(Integer.toString(a.getAge()));
            f1.append("\n");





        }

        f1.close();

  //      Arrays.stream(n).parallel().forEach(System.out::print);
         System.out.println("Файл готов");

  //      Arrays.stream(sur).parallel().forEach(System.out::print);
     }

    static void shuffleArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}

