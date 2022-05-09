package model;

import exception.StringLengthException;

public class Category {
    private Integer id;
    private String label;

    public Category(Integer id, String label) throws StringLengthException {
        setId(id);
        setLabel(label);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) throws StringLengthException {
        SecurityUtil.StringFormatTest("label", label.length(), SecurityUtil.stringMMaxLength, false);
        this.label = label;
    }
}
