public class Main {

    public static void main(String[] args) {

        for (int i=2; i<9; i++){
            System.out.println("10,000 at " + i + "interest" + String.format("%2f", calculateInterest(10000, i)));
        }

        for (int i=9; i>1; i--){
            System.out.println("10,000 at " + i + "interest" + String.format("%2f", calculateInterest(10000, i)));
        }

        int y = 0;

        for (int i=10; i<100; i++){

            if (isPrime(i)) {
                System.out.println(i);
                y++;
                if (y == 10){
                    System.out.println("count number" + y );
                    break;
                }
            }


        }
    }

    public static boolean isPrime(int n){

        if(n == 1) {
            return false;
        }
        for (int i=2; i<= (long) Math.sqrt(n); i++){
            if(n% i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {

        return(amount *(interestRate/100));
    }
}
