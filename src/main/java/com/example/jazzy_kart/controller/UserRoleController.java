package com.example.jazzy_kart.controller;

import com.example.jazzy_kart.model.UserRole;
import com.example.jazzy_kart.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    @PostMapping("/userRoles")
    public UserRole saveUserRole(@RequestBody UserRole userRole) {
        return userRoleService.saveUserRole(userRole);
    }

    @GetMapping("/userRoles")
    public List<UserRole> getAllUserRoles() {
        return userRoleService.getAllUserRoles();
    }

    @GetMapping("/userRoles/{id}")
    public UserRole getUserRoleById(@PathVariable Long id) {
        return userRoleService.getUserRoleById(id);
    }

    @PutMapping("/userRoles/{id}")
    public UserRole updateUserRole(@PathVariable Long id, @RequestBody UserRole userRoleDetails) {
        return userRoleService.updateUserRole(id, userRoleDetails);
    }

    @DeleteMapping("/userRoles/{id}")
    public void deleteUserRole(@PathVariable Long id) {
        userRoleService.deleteUserRole(id);
    }
}
