package model;

import exception.SecurityUtil;
import exception.StringLengthException;

public class Category {
    private String label;

    public Category(String label) throws StringLengthException {
        setLabel(label);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) throws StringLengthException {
        SecurityUtil.StringFormatTest("label", label.length(), SecurityUtil.stringMMaxLength, false);
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
