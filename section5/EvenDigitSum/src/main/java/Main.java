public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));

        System.out.println(getEvenDigitSum(2000));
        System.out.println(getEvenDigitSum(252));

    }

    public static int getEvenDigitSum(int number){

        int sum = 0;
        int lastDigit;
        int firstDigit;
        int even = 0;

        if (number <0 ){
            return -1;
        } else {

            while (number >= 10){

                lastDigit = number % 10;
                firstDigit = number / 10;

                if (lastDigit % 2 ==0) {
                    sum += lastDigit;

                    if (lastDigit == 0){
                        sum = firstDigit;

                    }
                    return sum;
                }


                number /= 10;


            }

            return sum;
        }
    }
}
