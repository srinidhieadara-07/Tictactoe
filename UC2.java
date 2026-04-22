import java.util.Random;

public class PlayerToss {

    public static void main(String[] args) {

        Random random = new Random();

        // Perform random toss
        int toss = random.nextInt(2);

        int currentPlayer;
        char player1Symbol;
        char player2Symbol;

        // Conditional logic to assign symbols
        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';

            System.out.println("Player 1 starts first.");
        } else {
            currentPlayer = 2;
            player1Symbol = 'O';
            player2Symbol = 'X';

            System.out.println("Player 2 starts first.");
        }

        // Display assigned symbols
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("Current Player: " + currentPlayer);
    }
}