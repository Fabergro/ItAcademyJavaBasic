public class hm3_6 {
    public static void main (String[] args) {
        long a = 20023143L;
        int i;

        StringBuffer str = new StringBuffer(Long.toString(a));
        i = str.length();

             while (i >= 3 ) {
                i -= 3;
                str.insert(i," ");
            }

        System.out.println(str);
     }


}
