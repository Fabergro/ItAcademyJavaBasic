package HOME6;
// что быстрее
public class hm6_6 {
    public static void main(String[] args) {
        String str = "";
        StringBuffer str1 = new StringBuffer();
        long t1 = 0;
        long t2 = 0;

        long begin =  System.nanoTime();
        for (int i = 0; i < 250000; i++) {
            str += "aaabbbccc";
        }
        long end = System.nanoTime();
        t1 = end - begin;

        System.out.println("Для String время работы - "+ t1 / 1000000  +" миллисекунд");

        begin =  System.nanoTime();
        for (int i = 0; i < 250000; i++) {
            str1.append("aaabbbccc");
        }
        end = System.nanoTime();
        t2 = end - begin;

        System.out.println("Для StringBuffer время работы - "+ t2 / 1000000 + " миллисекунд");
        System.out.println("Второй метод быстрее первого в " + t1 / t2 + " раз");
        //  System.nanoTime()
    }
}
