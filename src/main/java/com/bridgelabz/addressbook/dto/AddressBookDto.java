package com.bridgelabz.addressbook.dto;


public class AddressBookDto {
    private String firstname;
    private String lastname;
    private int mobilenumber;
    private String email;
    private int pincode;
    private String address;
    private String city;
    private String state;

    public AddressBookDto(String firstname, String lastname, int mobilenumber, String city, int pincode, String address, String email, String state){
        this.firstname= firstname;
        this.lastname= lastname;
        this.mobilenumber=mobilenumber;
        this.city=city;
        this.pincode=pincode;
        this.state= state;
        this.address=address;
        this.email=email;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mobilenumber=" + mobilenumber +
                ", email='" + email + '\'' +
                ", pincode=" + pincode +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

