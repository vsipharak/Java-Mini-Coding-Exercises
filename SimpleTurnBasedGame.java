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
        int playerRollValue = 0;

        while(true)
        {
            playerRollValue = rollDice();
            playerOneTurns++;
            playerOnePosition = playerOnePosition + playerRollValue;
            if(playerOnePosition >= 100)
            {
                System.out.println("The " + playerOne + " has won");
                System.out.println("Number of turns " + playerOneTurns);
                System.exit(0);
            }
            if(playerOnePosition == playerTwoPosition)
            {
                System.out.println("The " + playerOne + " landed on the " + playerTwo);
                System.out.println("Good bye " + playerTwo);
                playerTwoPosition = 0;

            }


            playerRollValue = rollDice();
            playerTwoTurns++;
            playerTwoPosition = playerTwoPosition + playerRollValue;
            if(playerTwoPosition >= 100)
            {
                System.out.println("The " + playerTwo + " has won");
                System.out.println("Number of turns " + playerTwoTurns);
                System.exit(0);
            }

            if(playerTwoPosition == playerOnePosition)
            {
                System.out.println("The " + playerTwo + " landed on the " + playerOne);
                System.out.println("Good bye " + playerOne);
                playerOnePosition = 0;

            }

        }
    } // end of main

    public static int rollDice()
    {

        int die1 = 1 + random.nextInt(6); // first die roll
        int die2 = 1 + random.nextInt(6); // second die roll
        int sum = die1 + die2; // sum of die values
        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
    // end class
}