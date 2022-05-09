package model;

import exception.StringLengthException;

public class Status {
    private Integer id;
    private String title;

    public Status(Integer id, String title) throws StringLengthException {
        setId(id);
        setTitle(title);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) throws StringLengthException {
        SecurityUtil.StringFormatTest("title", title.length(), SecurityUtil.stringSMaxLength, false);
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
