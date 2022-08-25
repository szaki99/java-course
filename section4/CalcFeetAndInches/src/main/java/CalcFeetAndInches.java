public class CalcFeetAndInches {

    public static double calcFeetAndInchestoCentimeters (double feet, double inches){

        double INCH = 2.54;
        double FEET = 12 ;

        if (feet >= 0 && (inches >=0 && inches <= 12 )){
            double centimeters = (feet * FEET) * INCH;
            centimeters += inches * INCH;
            System.out.println(feet + " feet, " +  inches +" inches = " + centimeters + " cm");

            return centimeters;
        }

        System.out.println("params invalid");

        return -1;
    }

    public static double calcFeetAndInchestoCentimeters (double inches){

        double FEET = 12 ;

        if (inches < 0 ){
            return -1;}

        double feet = (int) inches / FEET;
        double remainingInches = (int) inches % FEET;

        System.out.println("remaining inches " + remainingInches + "feet" + feet);

        return  calcFeetAndInchestoCentimeters (feet, remainingInches);
        }
}
