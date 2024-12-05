import java.util.*;
import java.util.Random;

public class HangmanGame {


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("pear");
        words.add("pineapple");
        words.add("banana");
        words.add("orange");
        words.add("cucumber");
        words.add("tomato");
        words.add("lemon");
        words.add("pepper");
        words.add("garlic");
        words.add("onion");
        words.add("broccoli");
        words.add("soup");
        words.add("potato");
        words.add("cat");
        words.add("dog");
        words.add("mule");
        words.add("horse");
        words.add("pig");
        words.add("rabbit");
        words.add("alligator");
        words.add("ant");
        words.add("monkey");
        words.add("bee");
        words.add("butterfly");
        words.add("camel");
        words.add("chicken");
        words.add("cow");
        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        String randomWord = words.get(randomIndex);

        Word word = new Word(randomWord);
        Player player = new Player();

        System.out.println("The hidden word is " + word.getMaskedWord());

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

            Scanner scanner = new Scanner(System.in);
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
