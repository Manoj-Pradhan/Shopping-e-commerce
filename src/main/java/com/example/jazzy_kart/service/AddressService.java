package com.example.jazzy_kart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jazzy_kart.impl.IAddressService;
import com.example.jazzy_kart.model.Address;
import com.example.jazzy_kart.repository.AddressRepository;

@Service
public class AddressService implements IAddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public Address updateAddress(Long id, Address addressDetails){
        return addressRepository.findById(id)
                .map(address -> {
                    address.setCity(addressDetails.getCity());
                    address.setState(addressDetails.getState());
                    address.setPinCode(addressDetails.getPinCode());
                    return addressRepository.save(address);
                })
                .orElse(null);

    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
