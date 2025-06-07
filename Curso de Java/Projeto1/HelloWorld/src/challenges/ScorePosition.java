package challenges;

public class ScorePosition {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Junior", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Maria", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Ana", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Pedro", position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("João", position);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            return position = 1;
        } else if (score >= 500) {
            return position = 2;
        } else if (score >= 100) {
            return 3;
        }
        return position;
    }
}
