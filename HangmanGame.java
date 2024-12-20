import java.util.*;
import java.util.Random;

public class HangmanGame {


    public static void HangmanGame(String[] args) {

            List<String> words = List.of("apple", "pear", "pineapple", "banana", "orange", "cucumber", "tomato", "lemon",
                    "pepper", "garlic", "onion", "broccoli", "soup", "potato", "cat", "dog", "mule", "horse", "pig", "rabbit",
                    "alligator", "ant", "monkey", "bee", "butterfly", "camel", "chicken", "cow");


        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        String randomWord = words.get(randomIndex);

        Word word = new Word(randomWord);
        Player player = new Player();

        System.out.println("The hidden word is " + word.getMaskedWord());

        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(word);

            if (player.getMistakes() >= 5) {
                System.out.println("You're loser:(( The hidden word was " + word.getWord());
                break;
            }
            if (word.isGuessed()) {
                System.out.println("You're genius:)) The hidden word is " + word.getWord());
                break;
            }

            System.out.println("If you want to give up - press 'Ctrl + D'");
            System.out.println("Enter the letter: ");


            String input = scanner.nextLine();
            if (input.length() != 1) {
                System.out.println("Hey, enter only one letter:(.");
                continue;
            }
            char letter = input.charAt(0);

            if (!word.guessLetter(letter)) {
                player.makeMistake();
            }
        }
    }
}
