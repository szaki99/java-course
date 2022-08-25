public class Exercice2 {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);


        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("sylvain", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Gertrude", position);

    }

    public static int calculateScore(boolean gameOver,
                                     int score,
                                     int levelCompleted,
                                     int bonus
    ) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(" managed to into position " + playerName);
        System.out.println(" on the high score table" + position);
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;
        if (score >= 1000){
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }
        return position;

    }
}
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score > 100) {
//            return 3;
//        }
//        return  4;

