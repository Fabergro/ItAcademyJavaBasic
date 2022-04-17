package HOME11;
//46 - список файлов и каталогов выбранного каталога на диске
import  java.io.*;

public class hm11_1 {
    public static void main(String[] args) throws IOException {
 //       File f = new File("file.txt");
  //      System.out.println(f.getCanonicalPath());

        System.out.println("Вывод всех каталогов и файлов для каталога C:\\Users\\");
        File f1 = new File("C:\\Users\\");
        File[] list = f1.listFiles();
        System.out.println("Каталоги");
        for (File s: list) {
            if (s.isDirectory()) {
            System.out.println(s.getCanonicalPath()); }
        }


        System.out.println();
        System.out.println("Файлы");
        for (File s: list) {
            if (s.isFile()) {
                System.out.println(s.getCanonicalPath()); }
        }
    }
}
