package Exception;

public class PlayerTypeInvalidException extends Exception {
    public PlayerTypeInvalidException() {
        super("The Character class you're trying to select doesn't exist.");
    }
}
