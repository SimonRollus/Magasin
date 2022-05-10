package model;

import exception.MissingObjectException;
import exception.SecurityUtil;
import exception.StringLengthException;

public class Address {
    private Integer id;
    private String street;
    private String postalCode;
    private String city;
    private String country;
    private String deliveryInformation;
    private User user;

    public Address(Integer id, String street, String postalCode, String city, String country, String deliveryInformation, User user) throws StringLengthException, MissingObjectException {
        setId(id);
        setStreet(street);
        setPostalCode(postalCode);
        setCity(city);
        setCountry(country);
        setDeliveryInformation(deliveryInformation);
        setUser(user);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStreet(String street) throws StringLengthException {
        SecurityUtil.StringFormatTest("street", street.length(), SecurityUtil.stringSMaxLength, false);
        this.street = street;
    }

    public void setPostalCode(String postalCode) throws StringLengthException {
        SecurityUtil.StringFormatTest("postalCode", postalCode.length(), SecurityUtil.postalCodeLength, true);
        this.postalCode = postalCode;
    }

    public void setCity(String city) throws StringLengthException {
        SecurityUtil.StringFormatTest("city", city.length(), SecurityUtil.stringSMaxLength, false);
        this.city = city;
    }

    public void setCountry(String country) throws StringLengthException {
        SecurityUtil.StringFormatTest("country", country.length(), SecurityUtil.stringSMaxLength, false);
        this.country = country;
    }

    public void setDeliveryInformation(String deliveryInformation) throws StringLengthException {
        SecurityUtil.StringFormatTest("deliveryInformation", deliveryInformation.length(), SecurityUtil.stringLMaxLength, false);
        this.deliveryInformation = deliveryInformation;
    }

    public void setUser(User user) throws MissingObjectException {
        SecurityUtil.MissingObjectTest("User", "Address", user);
    }

    public Integer getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getDeliveryInformation() {
        return deliveryInformation;
    }

    public User getUser() {
        return user;
    }
}
