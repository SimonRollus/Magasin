package exception;

public class MissingObjectException extends Exception {

    private String valueInvolved;
    private String classInvolved;

    public MissingObjectException(String valueInvolved, String classInvolved) {
        this.valueInvolved = valueInvolved;
        this.classInvolved = classInvolved;
    }

    public String getMessage() {
        return valueInvolved + "is missing in " + classInvolved;
    }
}
