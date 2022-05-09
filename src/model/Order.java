package model;

import exception.MissingObjectException;
import exception.StringLengthException;

import java.time.LocalDateTime;

public class Order {
    private Integer id;
    private LocalDateTime dateTimeCompletion;
    private LocalDateTime dateTimeDelivery;
    private boolean isComplete;
    private String note;
    private User employee;
    private User user;
    private Address address;
    private Status status;

    public Order(Integer id, LocalDateTime dateTimeCompletion, LocalDateTime dateTimeDelivery, boolean isComplete, String note, User employee, User user, Address address, Status status) throws StringLengthException, MissingObjectException {
        setId(id);
        setDateTimeCompletion(dateTimeCompletion);
        setDateTimeDelivery(dateTimeDelivery);
        setComplete(isComplete);
        setNote(note);
        setEmployee(employee);
        setUser(user);
        setAddress(address);
        setStatus(status);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        SecurityUtil.StringFormatTest("note", note.length(), SecurityUtil.stringXLMaxLength, false);
        this.note = note;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) throws MissingObjectException {
        SecurityUtil.MissingObjectTest("User", "Order", user);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
