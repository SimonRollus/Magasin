package exception;

public class MissingObjectException extends Exception {

    private String objectInvolved;
    private String classInvolved;

    public MissingObjectException(String objectInvolved, String classInvolved) {
        this.objectInvolved = objectInvolved;
        this.classInvolved = classInvolved;
    }

    public String getMessage() {
        return "An instance ";
    }
}
