package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.IUserRoleService;
import com.example.jazzy_kart.model.UserRole;
import com.example.jazzy_kart.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService implements IUserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public UserRole saveUserRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public List<UserRole> getAllUserRole(){
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole FindUserRoleById(Long id) {
        return null;
    }

    @Override
    public UserRole getUserRoleById(Long id) {
        return userRoleRepository.findById(id).orElse(null);
    }


    @Override
    public UserRole updateUserRole(Long id, UserRole userRoleDetails){
        return userRoleRepository.findById(id)
                .map(userRole -> {
                    userRole.setRoleName(userRoleDetails.getRoleName());
                    return userRoleRepository.save(userRole);
                })
                .orElse(null);
    }

    @Override
    public void deleteUserRole(Long id){
        userRoleRepository.deleteById(id);
    }

    @Override
    public List<UserRole> getAllUserRoles() {
        return null;
    }

//    @Override
//    public List<UserRole> getAllUserRoles() {
//        return null;
//    }

}
