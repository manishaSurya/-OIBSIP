package oasis_number_guessing_game;
import java.util.Scanner;
public class Oasis_Number_Guessing_Game {

    
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        game g = new game();
        System.out.println("lets play a game ,  GUESS THE NUMBER");
        System.out.println("you will get 10 chances to guess the number ");
        for (int i = 0; i < 10; i++) {
            int choice = sc.nextInt();
            g.takeUserInput(choice);
            g.noOfGuesses();

    }
    
  }
}
