package com.example.jazzy_kart.controller;

import com.example.jazzy_kart.model.Address;
import com.example.jazzy_kart.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AddressController {

    @Autowired
    private AddressService addressService;
    @GetMapping("/addresses")
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping("/address")
    public Address createAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }


    @PutMapping("/address/{id}")
    public Address updateAddress(@PathVariable Long id, @RequestBody Address addressDetails) {
        return addressService.updateAddress(id, addressDetails);
    }



//    @PutMapping("/{id}")
//    public Address updateAddress(@PathVariable Long id, @RequestBody Address address) {
//        Address existingAddress = addressService.getAddressById(id);
//        if (existingAddress != null) {
//            address.setId(id);
//            return addressService.saveAddress(address);
//        }
//        return null;
//    }

    @DeleteMapping("/address/{id}")
    public void deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
    }
}
