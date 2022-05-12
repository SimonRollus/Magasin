package model;


import exception.MissingObjectException;
import exception.StringLengthException;
import utilitary.Security;

import java.util.ArrayList;

public class User extends MagasinObjet {
    private String username;
    private Integer roleID;
    private String password;
    private String lastName;
    private String firstName;
    private String phoneNumber;

    private static ArrayList<Integer> idAlreadyExisting = new ArrayList<>();

    public User(Integer id, String username, Integer roleID, String password,String lastName, String firstName, String phoneNumber) throws StringLengthException, MissingObjectException {
        super(id);
        setUsername(username);
        setRoleID(roleID);
        setPassword(password);
        setLastName(lastName);
        setFirstName(firstName);
        setPhoneNumber(phoneNumber);
    }
    

    public void setUsername(String username) throws StringLengthException {
        Security.StringFormatTest("userName", username.length(), Security.stringSMaxLength, false);
       this.username = username;
    }

    public void setPassword(String password) throws StringLengthException {
        Security.StringFormatTest("password", password.length(), Security.stringLMaxLength, false);
        this.password = password;
    }

    public void setRoleID(Integer roleID) throws MissingObjectException {
        Security.MissingObjectTest("Role", "User", roleID);
        this.roleID = roleID;
    }

    public void setLastName(String lastName) throws StringLengthException {
        Security.StringFormatTest("lastName", lastName.length(), Security.stringSMaxLength, false);
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) throws StringLengthException {
        Security.StringFormatTest("firstName", firstName.length(), Security.stringSMaxLength, false);
        this.firstName = firstName;
    }

    public void setPhoneNumber(String phoneNumber) throws StringLengthException {
        Security.StringFormatTest("phoneNumber", phoneNumber.length(), Security.phoneNumberLength, true);
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public String getPassword() {
        return password;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", username='" + username + '\'' +
                ", role=" + roleID +
                ", password='" + password + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
