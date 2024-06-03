package com.xwb.Library.entity;

/**
 * @author xwb
 */
public class Reader {
    private int ReaderID;
    private String FirstName;
    private String LastName;
    private String Address;
    private String PhoneNumber;
    private Integer Limits;

    public int getReaderID() {
        return ReaderID;
    }

    public void setReaderID(int readerID) {
        ReaderID = readerID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Integer getLimits() {
        return Limits;
    }

    public void setLimits(Integer limits) {
        Limits = limits;
    }
}
