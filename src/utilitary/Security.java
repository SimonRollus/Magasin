package utilitary;

import exception.MissingObjectException;
import exception.StringLengthException;

public class Security {

    public static final Integer stringSMaxLength = 32;
    public static final Integer stringMMaxLength = 64;
    public static final Integer stringLMaxLength = 128;
    public static final Integer stringXLMaxLength = 256;


    public static final Integer phoneNumberLength = 9;
    public static final Integer postalCodeLength = 4;


    public static void StringFormatTest(String stringInvolved, Integer stringCurrentLength, Integer stringLengthLimit, boolean format) throws StringLengthException {

        /* format :
            false : the string must be in a certain interval of length
            true : the string must be in an exact length
        */

        if (format) {
            if (stringCurrentLength != stringLengthLimit)
                throw new StringLengthException(stringInvolved, stringCurrentLength, stringLengthLimit, format);
        } else {
            if (stringCurrentLength < 0 || stringCurrentLength > stringLengthLimit)
                throw new StringLengthException(stringInvolved, stringCurrentLength, stringLengthLimit, format);
        }

    }

    public static void MissingObjectTest(String objectInvolved, String classInvolved, Object object) throws MissingObjectException {
        if (object == null) {
            throw new MissingObjectException(objectInvolved, classInvolved);
        }
    }
}
