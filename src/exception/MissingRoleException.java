package exception;

public class MissingRoleException extends Exception {


    public MissingRoleException() {}

    public String getMessage() {
        return "A role is missing";
    }
}
