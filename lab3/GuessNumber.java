import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int counter =0;


        System.out.println("Hi! I'am thinking of a number between 0 and 99.");
        System.out.print("Can you guess it? ");

        int guess = reader.nextInt();

        while (guess!=number && guess!=-1){
            System.out.println("Sorry!");
            if (guess < number){
                System.out.println("Mine number is higher than your guess!");
                counter=counter+1;
            } else if(guess>number){
                System.out.println("Mine number is lower than your guess!");
                counter=counter+1;
            }
            System.out.println("Type -1 to exit or make another guess: ");
            guess = reader.nextInt();
        }

        if (guess==number){
            System.out.println("congratulations! You guessed the number in "+counter+" try");
        }
        reader.close();



    }
}
