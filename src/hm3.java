public class hm3 {
    public static void main(String[] args ) {
        long t = 10000000000020L;
        long t1;
        long sY = 31536000L;
        //  int sM = 2592000;
        long sW = 604800;
        long sD = 864500;
        long sH = 3600;
        long sMin = 60;
        long tY;
        long tM, tW, tD, tH, tMin, tSec;

        t1 = t;
        tY = t1 / sY;
        t1 = t - tY * sY;
        tW = t1 / sW;
        t1 = t1 - tW * sW;
        tD = t1 / sD;
        t1 = t1 - tD * sD;
        tH = t1 / sH;
        t1 = t1 - tH * sH;
        tMin = t1 / sMin;
        t1 = t1 - tMin * sMin;
        tSec = t1;


        System.out.println(tY + "год " + tW + "недель " + tD + "дней " + tH + "часов " + tMin + "минут " + tSec + "секунд ");

    }
}
