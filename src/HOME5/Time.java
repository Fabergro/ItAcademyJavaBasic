package HOME5;

public class Time {
    int sec = 0;
    int min = 0;
    int hour = 0;

    public Time() {
        sec = 0;
        min = 0;
        hour = 0;
    }
    public Time(int sec1, int min1, int hour1) {
        if (sec1 >= 0 || sec1 <=60 ) {
            sec = sec1;}
        else {
            sec = 0;}
        if (min1 >= 0 || min1 <=60 ) {
            min = min1;}
        else {
            min = 0;}

            hour = hour1;


    }

    public int getSec () {
        int full;
        full = sec + min * 60 + hour * 3600;
        return  full;
    }


}
