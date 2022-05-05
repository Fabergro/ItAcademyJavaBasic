package HOME17;

import java.lang.annotation.*;
import java.lang.reflect.*;
// 72- задача про собственную аннотацию

@Retention(RetentionPolicy.RUNTIME)
@interface AcademyInfo {

    int year();
}

public class HM17_3 {

    @AcademyInfo(year = 2022)
    public static void getAnno() {
        HM17_3 ob = new HM17_3();


        try {
             Class<?> c = ob.getClass();

             Method m = c.getMethod("getAnno");

            AcademyInfo anno = m.getAnnotation(AcademyInfo.class);

            System.out.println("Аннотация " + anno.year());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }



    }
    public static void getNoyAnno()  {
        System.out.println("Пусто. Нет аннотации.");
    }


    public static void main(String args[]) {
        getAnno();
        getNoyAnno();
    }
}

