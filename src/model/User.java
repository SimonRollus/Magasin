package model;


import exception.MissingObjectException;
import exception.SecurityUtil;
import exception.StringLengthException;

public class User {

    private Integer id;
    private String username;
    private Role role;
    private String password;
    private String lastName;
    private String firstName;
    private String phoneNumber;

    public User(Integer id, String username, Role role, String password,String lastName, String firstName, String phoneNumber) throws StringLengthException, MissingObjectException {
        setId(id);
        setUsername(username);
        setRole(role);
        setPassword(password);
        setLastName(lastName);
        setFirstName(firstName);
        setPhoneNumber(phoneNumber);
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) throws StringLengthException {
       SecurityUtil.StringFormatTest("userName", username.length(), SecurityUtil.stringSMaxLength, false);
       this.username = username;
    }

    public void setPassword(String password) throws StringLengthException {
        SecurityUtil.StringFormatTest("password", password.length(), SecurityUtil.stringLMaxLength, false);
        this.password = password;
    }

    public void setRole(Role role) throws MissingObjectException {
        SecurityUtil.MissingObjectTest("Role", "User", role);
        this.role = role;
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
        return username;
    }

    public Role getRole() {
        return role;
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
                "id=" + id +
                ", username='" + username + '\'' +
                ", role=" + role +
                ", password='" + password + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
