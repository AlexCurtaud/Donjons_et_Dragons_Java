package Exception;

public class OutOfBoardException extends Exception {
    public OutOfBoardException() {
        System.out.println("You've reached the end of the board ! Well done, you win !");
    }
}
