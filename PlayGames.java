import java.util.Scanner;  // Import the Scanner class

public class PlayGames {
    private static boolean playAgain = true;
    public static void main(String args[]){
        boolean validInput = false;
        System.out.println("Welcome to the Game of Games! Please enter the number of the corresponding game you wish to play:");
        System.out.println("\n");

        while(playAgain == true){
            System.out.println("\n 1 - Find the red thread;\n 2 - Guess the number;\n 3 - Find the thimble;\n 4 - Even or Odd;\n 5 - Coin flip\n");
           while(!validInput){
                int gameChosen = GetInput.numericInput();  // Read user input
            
                if(gameChosen == 1){
                    FindTheRedThread.playGame(); 
                    validInput = true;
                }
                else if(gameChosen == 2){
                    GuessTheNumber.playGame(); 
                    validInput = true;
                }
                else if(gameChosen == 3){
                    Thimble.gameThimble();
                    validInput = true;
                }
                else if(gameChosen == 4){
                    EvenOdd.rules();
                    EvenOdd.PlayGame();
                    validInput = true;
                }
                else if(gameChosen == 5){
                    CoinFlip.playGame();
                    validInput = true;
                }
                else{
                    System.out.println("Only input 1-5 is valid. Pick again.");
                }
            }

            Scoreboard.printScoreboard();
            int playAgainInput = GetInput.playAgain();
            if(playAgainInput == 1){
                playAgain = true;
            }
            if(playAgainInput == 2){
                playAgain = false;
            }
        }
        if(Scoreboard.userTotalScore > Scoreboard.computerTotalScore){
            System.out.println("Congrats! You win!");
        }
        else if(Scoreboard.userTotalScore < Scoreboard.computerTotalScore){
            System.out.println("Sorry! The computer wins! Try again soon!");

        }
        else{
            System.out.println("It was a tie!");
        }
        System.out.println("You scored " + Scoreboard.userTotalScore + " points and the computer scored " + Scoreboard.computerTotalScore + " points!");
        System.out.println("Here's the final scoreboard!");
        Scoreboard.printScoreboard();
    }
}
