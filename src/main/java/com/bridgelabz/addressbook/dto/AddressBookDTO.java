package com.bridgelabz.addressbook.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Pattern;

@Data
public @ToString class AddressBookDTO {
    private String FirstName;
    private String LastName;
    private int PhoneNumber;
    private String Email;
    private int PinCode;
    private String Address;
    private String City;
    private String State;
}