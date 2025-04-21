package com.bridgelabz.addressbook.model;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public @Data class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long contactId;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String city;
    private String state;
    private String address;
    private int pinCode;

    public Contact() {}

    public Contact(long contactId, AddressBookDTO addressBookDTO) {
        this.contactId = contactId;
        this.firstName = addressBookDTO.getFirstName();
        this.lastName = addressBookDTO.getLastName();
        this.phoneNumber=addressBookDTO.getPhoneNumber();
        this.email = addressBookDTO.getEmail();
        this.pinCode = addressBookDTO.getPinCode();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.address = addressBookDTO.getAddress();

    }
}
