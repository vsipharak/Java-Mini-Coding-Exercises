// Mini Coding Exercise: Calculate factorial of user input
import java.util.Scanner;
public class FactorialCalculatorExercise
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int factorial = 1;
        int userCount;

        System.out.println("Please enter any number to calculate its factorial: ");
        userCount = input.nextInt();

        for(int i = 1; i <= userCount; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + userCount + " is " + factorial + ".");

        // Second way of coding factorial
        // int factorialTwo = 1;
        // for(int i = userCount; i >= 1; i--)
        // {
        //    factorialTwo = factorialTwo * i;
        // }
        // System.out.println("The factorial two of " + userCount + " is " + factorialTwo + ".");
    }

}