public class hm2_6 {
    public static void main (String[] args) {

        System.out.println(getTask(10));

    }
    private static String getTask (int day) {

        switch (day) {
            case 1:
                return "Понедельник, задание.";
            case 2:
                return "Вторник, задание.";
            case 3:
                return "Среда, задание.";
            case 4:
                return "Четверг, задание.";
            case 5:
                return "Пятница, задание.";
            case 6:
                return "Суббота, задание.";
            case 7:
                return "Воскресенье, задание.";
            default:
                return "Проверить дату.";


        }
    }
}
