import java.util.Scanner;
import java.util.Random;
public class ProgramD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(0,10);
        // System.out.println("Index nummer för randomInt: " + randomInt);
        int numberOfAttempts = 0;
        String correctWordToGuess;
        String[] wordBank = {
                "Pyramid",
                "Snögubbe",
                "Rymdraket",
                "Kaktus",
                "Cirkus",
                "Glass",
                "Bibliotek",
                "Spöke",
                "Trollkarl",
                "Ficklampa"
        };
        correctWordToGuess = wordBank[randomInt].toLowerCase();
        // System.out.println("correctWordToGuess: " + correctWordToGuess);
        char [] ourGuessedWord = correctWordToGuess.toCharArray();

        for (int i = 0; i < ourGuessedWord.length; i++){
            if (i != 0 && i != ourGuessedWord.length-1){
                ourGuessedWord[i] = '_';
            }
        }
        System.out.println("var vänlig gissa på en bokstav som kan finnas i ordet(första och sista bokstaven kan även vara en giltig gissning): ");
        System.out.println(ourGuessedWord);

        while (true) {

            String charInput = scanner.next().trim().toLowerCase();
            char ourGuessedLetter = charInput.charAt(0);

            for (int i = 0; i < ourGuessedWord.length; i++) {
                if (correctWordToGuess.charAt(i) == ourGuessedLetter) {
                    ourGuessedWord[i] = ourGuessedLetter;
                }
            }
            numberOfAttempts += 1;
            String ourGuessedWordResult = String.valueOf(ourGuessedWord);
            if (ourGuessedWordResult.equals(correctWordToGuess)){
                break;
            }
            System.out.println("Gissa en ny bokstav: ");
            System.out.println(ourGuessedWord);
        }
        System.out.println(ourGuessedWord);
        System.out.println("Grattis det tog " + numberOfAttempts + " försök för att få fram rätt ord");
    }
}
/*


 */