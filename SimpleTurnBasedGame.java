// Mini Coding Exercise: Turn Based 2-player Game -- First to 100
import java.util.*; // the * will call anything in the util folder
public class SimpleTurnBasedGame
{
    static Scanner input = new  Scanner(System.in); // now it can be seen every where can also make a copy and put it down witht the
    static Random random = new Random();

    public static void main(String[] args)
    {
        String playerOne = "Rabbit";
        String playerTwo = "Tortoise" ;
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        int playerOneTurns = 0;
        int playerTwoTurns = 0;

        while(true) {
            // Player 1's turn
            System.out.println(playerOne + ", how many times would you like to roll the die? (Max: 2)");
            int playerOneRolls = getValidRolls();
            int playerOneRollValue = 0;
            for (int i = 0; i < playerOneRolls; i++) {
                int[] playerOneDice = rollDice();
                playerOneRollValue = playerOneDice[0] + playerOneDice[1]; //Calculates sum of dice
                System.out.println(playerOne + " rolled die 1: " + playerOneDice[0] + " and die 2: " + playerOneDice[1] + ".");
                playerOnePosition += playerOneRollValue;
                System.out.println(playerOne + " is now at position " + playerOnePosition);
                if (playerOnePosition >= 100) {
                    System.out.println("The " + playerOne + " has won!");
                    System.out.println("Number of turns: " + playerOneTurns);
                    System.exit(0);
                }
            }
            playerOneTurns++;

            if (playerOnePosition == playerTwoPosition) {
                System.out.println("The " + playerOne + " landed on the " + playerTwo);
                System.out.println("Goodbye, " + playerTwo + ". Best of luck next time!");
                playerTwoPosition = 0;
            }

            // Player 2's Turn
            System.out.println(playerTwo + ", how many times would you like to roll the die? (Max: 2)");
            int playerTwoRolls = getValidRolls();
            int playerTwoRollValue = 0;
            for (int i = 0; i < playerTwoRolls; i++) {
                int[] playerTwoDice = rollDice();
                playerTwoRollValue = playerTwoDice[0] + playerTwoDice[1]; //Calculates sum of dice
                System.out.println(playerTwo + "rolled die 1: " + playerTwoDice[0] + " and die 2: " + playerTwoDice[1] + ".");
                playerTwoPosition += playerTwoRollValue;
                System.out.println(playerTwo + " is now at position " + playerTwoPosition);
                if (playerTwoPosition >= 100) {
                    System.out.println("The " + playerTwo + " has won!");
                    System.out.println("Number of turns: " + playerTwoTurns);
                    System.exit(0);
                }
            }
            playerTwoTurns++;

            if (playerTwoPosition == playerOnePosition) {
                System.out.println("The " + playerTwo + " landed on the " + playerOne);
                System.out.println("Goodbye, " + playerOne + ". Best of luck next time!");
                playerOnePosition = 0;
            }
        }
    }
        // end of main

        //Modified rollDice method to return both die rolls
    public static int[] rollDice()
    {
        int die1 = 1 + random.nextInt(6); // first die roll
        int die2 = 1 + random.nextInt(6); // second die roll
        // Return an array with both die values
        return new int[] {die1, die2};
    }

        // Added method to get a valid number of rolls (1 or 2)
    public static int getValidRolls()
    {
        int rolls = input.nextInt();
        while (rolls < 1 || rolls > 2)
        {
            System.out.println("Invalid input! You can only choose '1' or '2' rolls. Please try again. :)");
            rolls = input.nextInt();
        }
        return rolls;
    }
    // end class
}