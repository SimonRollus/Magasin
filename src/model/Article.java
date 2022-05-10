package model;

import exception.MissingObjectException;
import exception.SecurityUtil;
import exception.StringLengthException;

public class Article {
    private Integer id;
    private String label;
    private Integer availableQuantity;
    private String description;
    private Category category;

    public Article(Integer id, String label, Integer availableQuantity, String description, Category category) throws StringLengthException, MissingObjectException {
        this.id = id;
        setLabel(label);
        this.availableQuantity = availableQuantity;
        setDescription(description);
        setCategory(category);
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

    public void setLabel(String label) throws StringLengthException{
        SecurityUtil.StringFormatTest("label", label.length(), SecurityUtil.stringLMaxLength, false);
        this.label = label;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws StringLengthException {
        SecurityUtil.StringFormatTest("description", description.length(), SecurityUtil.stringLMaxLength, false);
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) throws MissingObjectException{
        SecurityUtil.MissingObjectTest("Category", "Article", category);
    }
}
