package com.bridgelabz.addressbook.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public @ToString class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee first name is invalid")
    @NotBlank(message = "First name should not be null")
    private String FirstName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee last name is invalid")
    @NotBlank(message = "Last Name should not be null")
    private String LastName;

    @Pattern(regexp = "^[6-9]\\d{9}$")
    @NotNull(message = "Phone number should not be null")
    private String PhoneNumber;

    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")
    @NotBlank(message = "Email should not be null")
    private String Email;

    @Pattern(regexp = "^[1-9][0-9]{5}$")
    @NotNull(message = "pincode should not be null")
    private String PinCode;

    @NotBlank(message = "Address should not be null")
    private String Address;

    @NotBlank(message = "City Name should not be null")
    private String City;

    @NotBlank(message = "State Name should not be null")
    private String State;
}