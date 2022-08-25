public class SecondMinuteChallenge {

    private static final String INVALID_MESSAGE = "Invalid Value";

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

            int hours = minutes / 60;
            int minutesRemaining = minutes % 60;

            System.out.println("hours = " + hours);
            System.out.println("hoursRemaining = " + minutesRemaining);

            return hours + "h" + minutesRemaining + "m" + seconds + "s";

        }

        return INVALID_MESSAGE;

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_MESSAGE;
        } else {

            int minutes = seconds / 60;
            int secondsRemaining = seconds % 60;

            return getDurationString(minutes, secondsRemaining);
        }
    }
}
