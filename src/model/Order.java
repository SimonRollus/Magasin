package model;

import exception.MissingObjectException;
import exception.StringLengthException;
import utilitary.Security;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order extends MagasinObjet {
    private LocalDateTime dateTimeCompletion;
    private LocalDateTime dateTimeDelivery;
    private boolean isComplete;
    private String note;
    private Integer employeeID;
    private Integer userID;
    private Integer addressID;
    private Integer statusID;

    public Order(Integer id, LocalDateTime dateTimeCompletion, LocalDateTime dateTimeDelivery, boolean isComplete, String note, Integer employeeID, Integer userID, Integer addressID, Integer statusID) throws StringLengthException, MissingObjectException {
       super(id);
        setDateTimeCompletion(dateTimeCompletion);
        setDateTimeDelivery(dateTimeDelivery);
        setComplete(isComplete);
        setNote(note);
        setEmployeeID(employeeID);
        setUserID(userID);
        setAddressID(addressID);
        setStatusID(statusID);
    }

    public LocalDateTime getDateTimeCompletion() {
        return dateTimeCompletion;
    }

    public void setDateTimeCompletion(LocalDateTime dateTimeCompletion) {
        this.dateTimeCompletion = dateTimeCompletion;
    }

    public LocalDateTime getDateTimeDelivery() {
        return dateTimeDelivery;
    }

    public void setDateTimeDelivery(LocalDateTime dateTimeDelivery) {
        this.dateTimeDelivery = dateTimeDelivery;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) throws StringLengthException {
        Security.StringFormatTest("note", note.length(), Security.stringXLMaxLength, false);
        this.note = note;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employee) {
        this.employeeID = employeeID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer user) throws MissingObjectException {
        Security.MissingObjectTest("User", "Order", user);
    }

    public Integer getAddressID() {
        return addressID;
    }

    public void setAddressID(Integer address) {
        this.addressID = addressID;
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer status) {
        this.statusID = statusID;
    }
}
