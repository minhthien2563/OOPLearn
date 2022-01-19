package K14DCPM02.OOP.Game;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int p1_guess = 0;
        int p2_guess = 0;
        int p3_guess = 0;

        boolean p1_isRight = false;
        boolean p2_isRight = false;
        boolean p3_isRight = false;

        int targetNumber = (int) (Math.random() * 10);

        System.out.println("I'm thiking of a number between 0 and 9...");

        while(true) {
            System.out.println("Number go guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            p1_guess = p1.number;
            System.out.println("Player 1 guessed " + p1_guess);
            p2_guess = p1.number;
            System.out.println("Player 2 guessed " + p1_guess);
            p3_guess = p1.number;
            System.out.println("Player 3 guessed " + p1_guess);

            if (p1_guess == targetNumber) {
                p1_isRight = true;
            } else if (p2_guess == targetNumber) {
                p2_isRight = true;
            } else if (p3_guess == targetNumber) {
                p3_isRight = true;
            }

            if (p1_isRight || p2_isRight || p3_isRight) {
                System.out.println("We have a winner");
                System.out.println("Player 1 got it right? " + p1_isRight);
                System.out.println("Player 2 got it right? " + p2_isRight);
                System.out.println("Player 3 got it right? " + p3_isRight);
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }

    }
}
