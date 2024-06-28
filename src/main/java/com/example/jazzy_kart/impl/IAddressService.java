package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.Address;

import java.util.List;

public interface IAddressService {

    Address saveAddress(Address address);

    List<Address> getAllAddresses();

    Address getAddressById(Long id);

    Address updateAddress(Long id, Address addressDetails);

    void deleteAddress(Long id);
}
