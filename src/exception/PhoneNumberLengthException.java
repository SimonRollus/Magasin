package exception;

public class PhoneNumberLengthException extends Exception{
    private Integer nameLength;
    private Integer nameLengthMax;

    public PhoneNumberLengthException(Integer nameLength, Integer nameLengthMax) {
        this.nameLength = nameLength;
        this.nameLengthMax = nameLengthMax;
    }

    public String getMessage() {
        return "The phone number ( " + nameLength + " characters ) does not respect the length of " + nameLengthMax + "characters";
    }
}
