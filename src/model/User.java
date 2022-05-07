package model;

import exception.MissingRoleException;
import exception.NameLengthException;
import exception.PhoneNumberLengthException;

public class User {

    private static final Integer nameMaxLength = 32;
    private static final Integer phoneNumberLength = 15;

    private Integer id;
    private String userName;
    private Role role;
    private String lastName;
    private String firstName;
    private String phoneNumber;

    public User(Integer id, String userName, Role role, String lastName, String firstName, String phoneNumber) throws NameLengthException, MissingRoleException, PhoneNumberLengthException {
        this.id = id;
        setUserName(userName);
        setRole(role);
        setLastName(lastName);
        setFirstName(firstName);
        setPhoneNumber(phoneNumber);
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) throws NameLengthException {
        if (userName.length() >= 1 && userName.length() <= nameMaxLength) {
            this.userName = userName;
        } else {
            throw new NameLengthException("userName", userName.length(), nameMaxLength);
        }
    }

    public void setRole(Role role) throws MissingRoleException {
        if (role != null) {
            this.role = role;
        } else {
            throw new MissingRoleException();
        }

    }

    public void setLastName(String lastName) throws NameLengthException {
        if (lastName.length() >= 1 && lastName.length() <= nameMaxLength) {
            this.lastName = lastName;
        } else {
            throw new NameLengthException("lastName", lastName.length(), nameMaxLength);
        }
    }

    public void setFirstName(String firstName) throws NameLengthException {
        if (firstName.length() >= 1 && firstName.length() <= nameMaxLength) {
            this.firstName = firstName;
        } else {
            throw new NameLengthException("firstName", firstName.length(), nameMaxLength);
        }
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberLengthException {
        if (phoneNumber.length() == phoneNumberLength) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new PhoneNumberLengthException(phoneNumber.length(), phoneNumberLength);
        }
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return userName;
    }

    public Role getRole() {
        return role;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
