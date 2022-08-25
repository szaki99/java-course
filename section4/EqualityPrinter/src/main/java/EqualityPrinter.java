public class EqualityPrinter {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void printEqual(int p1, int p2, int p3){

        if (p1 <0 || p2 <0 || p3 <0){
            System.out.println(INVALID_VALUE);
            return;
        }

        if (p1 == p2 && p2 == p3){
            System.out.println("All numbers are equal");
            return;
        }

        if (p1 != p2 && p2 != p3 && p1 != p3){

            System.out.println("All numbers are different");
            return;
        }

        System.out.println("Neither all are equal or different");

    }

}
