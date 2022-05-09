package model;

import exception.StringLengthException;

public class Role {
    private Integer id;
    private String title;

    public Role(Integer id, String title) throws StringLengthException {
        setId(id);
        setTitle(title);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws StringLengthException {
        SecurityUtil.StringFormatTest("title", title.length(), SecurityUtil.stringSMaxLength, false);
        this.title = title;
    }
}
