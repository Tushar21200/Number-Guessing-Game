import java.util.*;
 class GuessNum {

    public static void guessingNumberGame() {
        
        Scanner scn = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());

        // K trials
        int k = 5;
        
        int i, guess;

        System.out.println("A No. is chosen between 1 to 100. Guess the number within 5 trials.");

        for(i = 0; i < k; i++) {
            System.out.println("Guess the number: ");
            guess = scn.nextInt();

            if(number == guess) {
                System.out.println("Congratulations! You guessed the number." );
                break;
            } else if(number > guess && i != k - 1) {
                System.out.println("The number is greater than " + guess);
            } else if(number < guess && i != k - 1) {
                System.out.println("The number is less than " + guess);
            }
        }
        if(i == k) {
            System.out.println("You have exhausted k trials.");
            System.out.println("The number was " + number);
        }
    }
    public static void main(String[] args) {
        // Function call
        guessingNumberGame();
    }
}