package model;

import exception.MissingObjectException;
import exception.StringLengthException;
import utilitary.Security;

import java.util.ArrayList;

public class Role extends MagasinObjet {
    private String title;

    public Role(Integer id, String title) throws StringLengthException, MissingObjectException {
        super(id);
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws StringLengthException {
        Security.StringFormatTest("title", title.length(), Security.stringSMaxLength, false);
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
