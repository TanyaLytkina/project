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
        for (boolean b : guessed) {
            if (!b) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sth = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sth.append(guessed[i] ? word.charAt(i) : "_");
            sth.append(" ");
        }
        return sth.toString();
    }

    public String getWord() {
        return word;
    }

    public String getMaskedWord() {
        StringBuilder sth = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sth.append("*");
        }
        return sth.toString();
    }
}
