package model;


import exception.MissingObjectException;
import exception.StringLengthException;

public class User {

    private Integer id;
    private String userName;
    private Role role;
    private String lastName;
    private String firstName;
    private String phoneNumber;

    public User(Integer id, String userName, Role role, String lastName, String firstName, String phoneNumber) throws StringLengthException, MissingObjectException {
        setId(id);
        setUserName(userName);
        setRole(role);
        setLastName(lastName);
        setFirstName(firstName);
        setPhoneNumber(phoneNumber);
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) throws StringLengthException {
       SecurityUtil.StringFormatTest("userName", userName.length(), SecurityUtil.stringSMaxLength, false);
       this.userName = userName;
    }

    public void setRole(Role role) throws MissingObjectException {
        SecurityUtil.MissingObjectTest("Role", "User", role);
    }

    public void setLastName(String lastName) throws StringLengthException {
        SecurityUtil.StringFormatTest("lastName", lastName.length(), SecurityUtil.stringSMaxLength, false);
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) throws StringLengthException {
        SecurityUtil.StringFormatTest("firstName", firstName.length(), SecurityUtil.stringSMaxLength, false);
        this.firstName = firstName;
    }

    public void setPhoneNumber(String phoneNumber) throws StringLengthException {
        SecurityUtil.StringFormatTest("phoneNumber", phoneNumber.length(), SecurityUtil.phoneNumberLength, true);
        this.phoneNumber = phoneNumber;
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
