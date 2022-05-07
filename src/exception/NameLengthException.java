package exception;

public class NameLengthException extends Exception {
    private String  nameInvolved;
    private Integer nameLength;
    private Integer nameLengthLimit;

    public NameLengthException(String nameInvolved, Integer nameLength, Integer nameLengthLimit) {
        this.nameInvolved = nameInvolved;
        this.nameLength = nameLength;
        this.nameLengthLimit = nameLengthLimit;
    }

    public String getMessage() {
        return nameInvolved + " does not respect the length format (" + nameInvolved +
                " characters), it should be between 1 and " + nameLengthLimit +
                " characters";
    }
}
