package model;

import exception.MissingObjectException;
import exception.StringLengthException;
import utilitary.Security;

import java.util.ArrayList;

public class Article extends MagasinObjet {
    private String label;
    private Integer availableQuantity;
    private String description;
    private Integer categoryID;

    public Article(Integer id, String label, Integer availableQuantity, String description, Integer categoryID) throws StringLengthException, MissingObjectException {
        super(id);
        setLabel(label);
        this.availableQuantity = availableQuantity;
        setDescription(description);
        setCategoryID(categoryID);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) throws StringLengthException{
        Security.StringFormatTest("label", label.length(), Security.stringLMaxLength, false);
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
        Security.StringFormatTest("description", description.length(), Security.stringLMaxLength, false);
        this.description = description;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) throws MissingObjectException{
        Security.MissingObjectTest("CategoryID", "Article", categoryID);
        this.categoryID = categoryID;
    }
}
