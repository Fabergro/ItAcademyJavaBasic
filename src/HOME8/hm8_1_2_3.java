package HOME8;

import java.util.Scanner;

//35, 36,37 сезоны года через enum, следующий сезон и сумма дней в сезоне
public class hm8_1_2_3 {
    public static void main(String[] args) {

        // 8_1 вывод на экран весь енум
        for (Seasons s : Seasons.values()) {
            System.out.println(s.getUrl());
        }

    //    8_2 и 8_3 следующий сезон и сумма дней на указанную пору


        System.out.println("Введете пору года (кириллицей) правильно, получите следующую пору ! ");
        Scanner in = new Scanner(System.in);
        String url = in.nextLine();


        Seasons en = Seasons.getNextUrl(url);
        System.out.println(en.getUrl());

        Integer enn = Seasons.getSummaDay(url);
        System.out.println("Дней в поре года " + url + " - " + enn);

     }



        public enum Seasons {
            WINTER("Зима"),
            SPRING("Весна"),
            SUMMER("Лето"),
            AUTUMN("Осень");

            private final String url;

            Seasons(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }


            public static Seasons getNextUrl(String url) {

                int k = 0;
                int i = 0;
                for (Seasons en : values()) {

                    if (k == 1 && i != 4) {
                        return en;
                    }
                    if (en.getUrl().equalsIgnoreCase(url)) {
            //           if (k == 1) { return en; }
                       k++;
                    }


                    if (k == 1 && i == 3) {
                        for (Seasons enn : values()) {
                            return enn;
                        }
                    }
                    i++;
                }

                // Либо просто вернуть null
                throw new IllegalArgumentException("AAAAAAAAAAA  " + url + " нету такой поры");
            }


            public static Seasons getNUrl(String url) {


                for (Seasons en : values()) {

                    if (en.getUrl().equalsIgnoreCase(url)) {
                        return en;
                    }
                }
                    throw new IllegalArgumentException("AAAAAAAAAAA  " + url + " нету такой поры");

            }



            public static Integer getSummaDay (String url) {

          Seasons en = Seasons.getNUrl(url);

          switch (en) {
              case WINTER:
                  return 90;
              case SPRING:
                  return 92;
              case SUMMER:
                  return 92;
              case AUTUMN:
                  return 91;
              default:
                  return 0;
          }
      }
    }

}
