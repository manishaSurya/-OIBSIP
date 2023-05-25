package oasis_number_guessing_game;

import java.util.Random;
import java.util.Scanner;

class game {
    Random rand = new Random();
    private int compNo, inp;
    private int noOf = 10;

     game() {
        compNo = rand.nextInt(100);
    }

     void takeUserInput(int inpu) {
        this.inp = inpu;
    }

     String isCorrectNumber() {
        return "your choice is correct";
    }

     void noOfGuesses() {

        if (inp == compNo) {
            System.out.println(isCorrectNumber());
            System.out.println("Score is: "+noOf+"/10");
        } else if (inp > compNo) {
            System.out.println("Your guess is greater than expected No");
            System.out.println("chances left: " +(noOf - 1));
            noOf--;
        } else {
            System.out.println("Your guess is less than expected no.");
            System.out.println("Chances left: "+ (noOf - 1));
            noOf--;
        }

     }
}

