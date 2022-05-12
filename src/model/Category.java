package model;

import exception.MissingObjectException;
import exception.StringLengthException;
import utilitary.Security;

import java.util.ArrayList;

public class Category extends MagasinObjet {
    private String label;

    public Category(Integer id, String label) throws StringLengthException, MissingObjectException {
        super(id);
        setLabel(label);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) throws StringLengthException {
        Security.StringFormatTest("label", label.length(), Security.stringMMaxLength, false);
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
