package model;

import exception.MissingObjectException;
import exception.StringLengthException;
import utilitary.Security;

public class Address extends MagasinObjet {
    private String street;
    private String postalCode;
    private String city;
    private String country;
    private String deliveryInformation;
    private Integer userID;

    public Address(Integer id, String street, String postalCode, String city, String country, String deliveryInformation, Integer userID) throws StringLengthException, MissingObjectException {
        super(id);
        setStreet(street);
        setPostalCode(postalCode);
        setCity(city);
        setCountry(country);
        setDeliveryInformation(deliveryInformation);
        setUserID(userID);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) throws StringLengthException {
        Security.StringFormatTest("street", street.length(), Security.stringSMaxLength, false);
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) throws StringLengthException {
        Security.StringFormatTest("postalCode", postalCode.length(), Security.postalCodeLength, true);
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws StringLengthException {
        Security.StringFormatTest("city", city.length(), Security.stringSMaxLength, false);
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) throws StringLengthException {
        Security.StringFormatTest("country", country.length(), Security.stringSMaxLength, false);
        this.country = country;
    }

    public String getDeliveryInformation() {
        return deliveryInformation;
    }

    public void setDeliveryInformation(String deliveryInformation) throws StringLengthException {
        Security.StringFormatTest("deliveryInformation", deliveryInformation.length(), Security.stringLMaxLength, false);
        this.deliveryInformation = deliveryInformation;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer user) throws MissingObjectException {
        Security.MissingObjectTest("User", "Address", user);
    }

}
