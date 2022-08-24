import java.util.Arrays;
import java.util.List;

public class TeenNumberChecker {

    public static boolean hasTeen(int p1, int p2, int p3) {

        List myList;

        myList = Arrays.asList(p1, p2, p3);

        int i = 0;
        while (i < myList.size()) {
            int p = (int) myList.get(i);
            if (p >= 13 && p <= 19) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean isTeen(int p1)  {

        return p1 >= 13 && p1 <= 19;

    }
}
