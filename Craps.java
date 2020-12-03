/////////////////////////////////////
//Derek McPeak
//CSC 160 Computer Science 1
//10/07/2020
//Game of craps
/////////////////////////////////////

    // importing random utlility
import java.util.Random;

public class Craps {

    public static void main(String[] args) {

            // calling random and assigning it to "dice"
        Random dice = new Random();

            // printing out the message "lets play craps"
        System.out.println("Lets play craps!");

            // genrating a randondom number between 0-5, assigning it to roll1
        int roll1 = dice.nextInt(6);

            // genrating a randondom number between 0-5 assigning it to roll2
        int roll2 = dice.nextInt(6);

            // taking variable roll1 and roll 2, adding them together, while adding the numerical value of 1 to each...
            // ... variable to change the range from 0 - 5, to 1 - 6.
        int dicerolltotal = 1 + roll1 + 1 + roll2;

            // printing out the useres first dice roll.
        System.out.println("Your first roll was " + dicerolltotal);

            // checking to see if the total of roll1 & 2, equal 2,3, or 12; if so, they lose.
        if (dicerolltotal == 2 || dicerolltotal == 3 || dicerolltotal == 12) {
            // printing "you lose"
            System.out.println("You lose!");

            // checking to see if roll1 & 2 equal 7 or 11; if so. they win.
        } else if (dicerolltotal == 7 || dicerolltotal == 11) {
            // printing message "you win"
            System.out.println("You win, lets play again.");

            // last check to see if the user rolls 4,5,6,8,9,10, if so they win.
        } else {
                // assigning variable point to diceroll, to track the rolls.
            int point = dicerolltotal;

                // printing out the message, and the point value.
            System.out.println("The point is: " + point);
                // a loop to where, if they roll 4,5,6,8,9,10, it will keep looping them through...
                // ... as long as they roll 4,5,6,8,9,10. If it lands on 7, it kicks them out and they lose.
            while (true) {
                roll1 = dice.nextInt(6);
                roll2 = dice.nextInt(6);
                dicerolltotal = roll1 + 1 + roll2 + 1;
                System.out.println("New roll is " + dicerolltotal);
                if (dicerolltotal == point) {
                        // if the user rolls 4,5,6,8,9,10, they win.
                    System.out.println("Rolled point, winner!");
                        // if they roll 4,5,6,8,9,10, its takes them out of the if, and returns them to the while loop.
                    break;
                }
                if (dicerolltotal == 7) {
                        // if they roll 7, they lose.
                    System.out.println("Lost with a roll of 7");
                    break;
                }

            }
        }

    }
}

