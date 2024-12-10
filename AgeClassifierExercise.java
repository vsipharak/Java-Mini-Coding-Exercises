// Mini Coding Exercise - Age Classifier Coding Exercise
import java.util.Scanner;
public class AgeClassifierExercise
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Please enter your name: ");
        name = input.next();

        System.out.println("Please enter your age: ");
        age = input.nextInt();


        if(age <= 12)
        {
            System.out.println("You've entered: " + age + ". This classifies you as a young person, " + name + ".");
        }

        if(age > 12 && age <= 19)
        {
            System.out.println("You've entered: " + age + ". This classifies you as a teenager, " + name + ".");
        }

        if(age > 19 && age < 65)
        {
            System.out.println("You've entered: " + age + ". This classifies you as an adult, " + name + ".");
        }

        if(age >= 65)
        {
            System.out.println("You've entered: " + age + ". This classifies you as an elder, " + name + ".");
        }


    }
}
   