package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.Contact;
import com.bridgelabz.addressbook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO>getAllContacts(){
        List<Contact> contactList= addressBookService.getAllContacts();
        contactList= addressBookService.getAllContacts();
        ResponseDTO responseDTO= new ResponseDTO("Get Call Successful", contactList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAllContacts(@PathVariable ("contactId") long contactId , @RequestBody AddressBookDTO addressBookDTO) {
        Contact contact= null;
        contact = addressBookService.getContactById(contactId, addressBookDTO);
        ResponseDTO responseDTO= new ResponseDTO("Get call foR ID Successful", contactId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createContact(@RequestBody AddressBookDTO addressBookDTO) {
        Contact contact= null;
        contact = addressBookService.createContact(addressBookDTO);
        ResponseDTO responseDTO= new ResponseDTO("Contact created Successfully", contact);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateContactById(@PathVariable ("contactId")long contactId, @RequestBody AddressBookDTO addressBookDTO) {
        Contact contact= null;
        contact = addressBookService.updateContactById(contactId,addressBookDTO);
        ResponseDTO responseDTO= new ResponseDTO("Contact updated Successfully", contact);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactById(@PathVariable("contactId") long contactId) {
        addressBookService.deleteContactById(contactId);
        ResponseDTO responseDTO = new ResponseDTO("Contact Deleted successfully", "Deleted Id:" + contactId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}