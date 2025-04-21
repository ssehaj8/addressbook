package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getAllContacts();

    Contact getContactById(long contactId, AddressBookDTO addressBookDTO);

    Contact createContact(AddressBookDTO addressBookDTO);

    Contact updateContactById(long contactId, AddressBookDTO addressBookDTO);

    void deleteContactById(long contactId);
}