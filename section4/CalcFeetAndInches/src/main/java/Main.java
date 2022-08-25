public class Main {
    public static void main(String[] args) {


        double result = CalcFeetAndInches.calcFeetAndInchestoCentimeters(6, 0);

        System.out.println(result);

        result = CalcFeetAndInches.calcFeetAndInchestoCentimeters(-1, 0);
        System.out.println(result);

        result = CalcFeetAndInches.calcFeetAndInchestoCentimeters(157);
        System.out.println(result);


    }
}
