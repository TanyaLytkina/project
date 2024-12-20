public class Word {
    private String word;
    private boolean[] guessed;

    public Word(String word) {
        this.word = word.toLowerCase();
        this.guessed = new boolean[word.length()];
    }

    public boolean guessLetter(char letter) {
        boolean found = false;
        letter = Character.toLowerCase(letter);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessed[i] = true;
                found = true;
            }
        }
        return found;
    }

    public boolean isGuessed() {
        for (boolean isGuessed : guessed) {
            if (!isGuessed) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(guessed[i] ? word.charAt(i) : "_");
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public String getWord() {
        return word;
    }

    public String getMaskedWord() {
        return "*".repeat(word.length());
    }
}
