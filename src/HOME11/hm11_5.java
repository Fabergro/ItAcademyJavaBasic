package HOME11;

import  java.io.*;
import java.util.ArrayList;
import java.util.Random;

import java.util.regex.*;

//50 - цепочка из 3х папок, 5ть файлов, скопировать все в один
public class hm11_5 {
    public static void main(String[] args) throws Exception {

        String trm = "c:\\Users\\kirill\\IdeaProjects\\HM\\";
        File f = new File(trm + "a1\\a2\\a3");
        if (!f.isDirectory()) {
            f.mkdirs();
        }

        trm += "a1\\a2\\a3\\";
        System.out.println(trm);

        File f1 = new File(trm + "b1.txt");
        if (!f1.exists()) {
            try {
                boolean created = f1.createNewFile();
              } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        File f2 = new File(trm + "b2.txt");
        if (!f2.exists()) {
            try {
                boolean created = f2.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        File f3 = new File(trm + "b3.txt");
        if (!f3.exists()) {
            try {
                boolean created = f3.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        File f4 = new File(trm + "b4.txt");
        if (!f4.exists()) {
            try {
                boolean created = f4.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        File f5 = new File(trm + "b5.txt");
        if (!f5.exists()) {
            try {
                boolean created = f5.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        File f99 = new File(trm + "all.txt");
        if (!f99.exists()) {
            try {
                boolean created = f99.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        File f98 = new File(trm + "files.txt");
        if (!f98.exists()) {
            try {
                boolean created = f98.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }



     //   int s11 = 0, s12 = 0, s13 = 0, s14 = 0, s15 = 0;
        final Random random = new Random();
        BufferedWriter f11 = new BufferedWriter(new FileWriter(trm + "b1.txt"));
        BufferedWriter f12 = new BufferedWriter(new FileWriter(trm + "b2.txt"));
        BufferedWriter f13 = new BufferedWriter(new FileWriter(trm + "b3.txt"));
        BufferedWriter f14 = new BufferedWriter(new FileWriter(trm + "b4.txt"));
        BufferedWriter f15 = new BufferedWriter(new FileWriter(trm + "b5.txt"));

        for (int i = 0; i < 10; i++) {

            String s11 = Integer.toString(random.nextInt(1000));
            String s12 = Integer.toString(random.nextInt(1000));
            String s13 = Integer.toString(random.nextInt(1000));
            String s14 = Integer.toString(random.nextInt(1000));
            String s15 = Integer.toString(random.nextInt(1000));

            f11.append(s11);
            f11.append(';');
            f12.append(s12);
            f12.append(';');
            f13.append(s13);
            f13.append(';');
            f14.append(s14);
            f14.append(';');
            f15.append(s15);
            f15.append(';');

           }
        f11.close();
        f12.close();
        f13.close();
        f14.close();
        f15.close();


        BufferedReader in;
        String trm1;
        BufferedWriter f100 = new BufferedWriter(new FileWriter(trm + "all.txt"));

  //      String s15 = Integer.toString(random.nextInt(1000));
   //     f100.append(s15);


        for (int i = 1; i <= 5 ; i++) {

            trm1 = "b" + i + ".txt";
            System.out.println(trm1);
            in = new BufferedReader(new FileReader(trm + trm1));
            String str = in.readLine();

            System.out.println(str + "   " + trm1);
            f100.write(str);
            f100.append("\n");
   //         f100.append("1");

        }
        f100.close();


        BufferedWriter f91 = new BufferedWriter(new FileWriter(trm + "files.txt"));
        File f90 = new File(trm);
        String[] list = f90.list();
        for (String st: list) {

            f91.append(st);
     //       f91.write(st);
            f91.append("\n");
            System.out.println(st);

        }
        f91.close();
    //    System.out.println(str + "   " + trm1 );

    }
}
