public class Player {
    private int mistake;

    public Player() {
        this.mistake = 0;
    }

    public void makeMistake() {
        mistake++;
        System.out.println("The number of your mistakes is " + mistake + " out of 5. Be careful!");
    }

    public int getMistakes() {
        return mistake;
    }
}


