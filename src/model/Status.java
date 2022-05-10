package model;

import exception.SecurityUtil;
import exception.StringLengthException;

public class Status {
    private String title;

    public Status(String title) throws StringLengthException {
        setTitle(title);
    }

    public void setTitle(String title) throws StringLengthException {
        SecurityUtil.StringFormatTest("title", title.length(), SecurityUtil.stringSMaxLength, false);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
