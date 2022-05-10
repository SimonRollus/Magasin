package model;

import exception.SecurityUtil;
import exception.StringLengthException;

public class Role {
    private String title;

    public Role(String title) throws StringLengthException {
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws StringLengthException {
        SecurityUtil.StringFormatTest("title", title.length(), SecurityUtil.stringSMaxLength, false);
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
