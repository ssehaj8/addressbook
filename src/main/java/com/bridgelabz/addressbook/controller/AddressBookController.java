package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    //@Autowired
    //private AddressBookService addressBookService;
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String>getUserData(){
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    // Get a single entry by ID
    @GetMapping("/get/{id}")
    public ResponseEntity<String> getUserData(@PathVariable int userid) {
        return new ResponseEntity<String>("Get Call Success by Id", HttpStatus.OK);
    }

    // Create a new entry
    @PostMapping("/create")
    public ResponseEntity<String> addUserData(@RequestBody AddressBookDto userDto) {
        return new ResponseEntity<String>("Created User Data For: "+userDto, HttpStatus.OK);
    }

    // Update an existing entry
    @PutMapping("/update")
    public ResponseEntity<String> updateUserData(@RequestBody AddressBookDto userDto) {
        return new ResponseEntity<String>("Updated User Data for: " + userDto, HttpStatus.OK);
    }
    // Delete an entry
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUserData(@PathVariable("userId") int empId) {
        return new ResponseEntity<String>("Delete Call Success for id: "+empId, HttpStatus.OK);
    }
}