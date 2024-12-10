// Generate random heads and tails
import java.util.Scanner;
import java.util.Random;
public class CoinFlipExercise
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int userInput;
        int numbHeads = 0;
        int numbTails = 0;
        int totalFlips = 0;

        System.out.println("How many times would you like to flip the coin?");
        userInput = input.nextInt();
        for(int i = 1; i <= userInput; i++)
        {
            boolean flipValue = random.nextBoolean();
            totalFlips++;

            if(flipValue == true)
                numbHeads++;

            if(flipValue == false)
                numbTails++;
        }
        System.out.println("You have chosen to flip the coins " + totalFlips + " times.");
        System.out.println("The coin landed on heads " + numbHeads + " times.");
        System.out.println("The coin landed on tails " + numbTails + " times.");
    }
}
   