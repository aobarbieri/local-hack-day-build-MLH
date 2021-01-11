import java.util.Random;
import java.util.Scanner;
/**
 * The Game class will allow a user to enter numbers for
 * a guessing game.
 *
 * @author Amanda Barbieri
 * @version 01-11-2021
 */
public class Game{
    // fields
    private Random randomGen;
    private Scanner scanner;

    /**
     * Constructor for objects of class Game
     */
    public Game(){
        randomGen = new Random();
        scanner = new Scanner(System.in);

    }

    /*/**
     * Main method that will call the setUserRandom method
     */
    public static void main(String[] args) {
        Game playGame = new Game();
        playGame.setUserRandom();
    }

    /**
     * Method that will let the user to guess a random number
     * The number is between 1 and 100. The player will be told if the number is too low, 
     * too high or correct.
     */
    public void setUserRandom(){
        int userInput = 0;
        boolean finished = false;
        int tempNum = randomGen.nextInt(101) + 1;

        System.out.println("Guess a number from 1 to 100. Enter '0' to stop");
        userInput = scanner.nextInt();

        while(finished == false){
            if(userInput >= 1 && userInput <= 100){
                if(userInput == tempNum){
                    finished = true;
                    System.out.println("You won!!!");
                    System.out.println("Number: " + tempNum);
                }else if(userInput > tempNum){
                    System.out.println("Your guess is too high, try again! ");
                    userInput = scanner.nextInt();

                }else if(userInput < tempNum){
                    System.out.println("Your guess is too low, try again! ");
                    userInput = scanner.nextInt();
                }
            }else if(userInput == 0){
                finished = true;
            }else{
                System.out.println("It must be a number from 1 to 100.");
                System.out.println("Guess a number from 1 to 100. Enter '0' to stop");
                userInput = scanner.nextInt();
            }
        }
        System.out.println("----------End----------"); 
    }
}
