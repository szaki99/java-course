public class Main {


    public static void main(String[] args) {

        //System.out.println(sumFirstAndLastDigit(252));
//        sumFirstAndLastDigit(257);
//        sumFirstAndLastDigit(0);
        System.out.println(sumFirstAndLastDigit(5));
//        sumFirstAndLastDigit(-10);
    }

    public static int sumFirstAndLastDigit(int number) {

        int sum;
        int lastDigit;
        int firstDigit = 0;
        if (number < 0) {
            return -1;
        } else {
            lastDigit = number % 10;
            // System.out.println(lastDigit);

            while (number >= 10) {
                number /= 10;
                firstDigit = number;
                // System.out.println(firstDigit);

            }

            if (firstDigit == 0){
                return lastDigit + lastDigit;
            }

            sum = firstDigit + lastDigit;
            return sum;
        }
    }
}
