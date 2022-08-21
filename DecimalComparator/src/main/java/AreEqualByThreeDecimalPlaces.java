import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;

class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {

        DecimalFormat df = new DecimalFormat();
        df.setRoundingMode(RoundingMode.DOWN);
        df.setMaximumFractionDigits(3);

        return Objects.equals(df.format(param1), df.format(param2));
    }
}

