package exception;

public class StringLengthException extends Exception {
    private String  stringInvolved;
    private Integer stringCurrentLength;
    private Integer stringLengthLimit;
    private boolean format;

    public StringLengthException(String stringInvolved, Integer stringCurrentLength, Integer stringLengthLimit, boolean format) {
        this.stringInvolved = stringInvolved;
        this.stringCurrentLength = stringCurrentLength;
        this.stringLengthLimit = stringLengthLimit;
        this.format = format;
    }

    public String getMessage() {
        if (format) {
            return "the length of " + stringInvolved + "(currently " + stringCurrentLength + "characters) must be " + stringLengthLimit + " characters long";
        } else {
            return "the length of " + stringInvolved + "(currently " + stringCurrentLength + "characters) must be in a interval of 1 and " + stringLengthLimit + " characters";
        }

    }
}
