public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            System.out.println( year + "> 1 and year < 9999");

            if (year % 4 == 0 ) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }
        }
        return false;
    }
}
