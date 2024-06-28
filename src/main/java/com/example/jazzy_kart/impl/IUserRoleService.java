package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.UserRole;

import java.util.List;

public interface IUserRoleService {

    UserRole saveUserRole(UserRole userRole);

    List<UserRole> getAllUserRole();

    UserRole FindUserRoleById(Long id);

    UserRole getUserRoleById(Long id);

    UserRole updateUserRole(Long id, UserRole userRoleDetails);

    void deleteUserRole(Long id);

    List<UserRole> getAllUserRoles();
}
