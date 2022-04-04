package system;

public class UserNotFindeException extends RuntimeException{
    public UserNotFindeException() {
        super("User not fide");
    }
}
