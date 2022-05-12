package model;

import exception.MissingObjectException;
import exception.StringLengthException;
import utilitary.Security;

import java.util.ArrayList;

public class Status extends MagasinObjet {
    private String title;

    public Status(Integer id, String title) throws StringLengthException, MissingObjectException {
        super(id);
        setTitle(title);
    }

    public void setTitle(String title) throws StringLengthException {
        Security.StringFormatTest("title", title.length(), Security.stringSMaxLength, false);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
