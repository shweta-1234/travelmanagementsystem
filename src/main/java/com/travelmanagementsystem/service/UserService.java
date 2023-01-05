package com.travelmanagementsystem.service;

import com.travelmanagementsystem.domain.User;
import com.travelmanagementsystem.service.dto.AdminUserDTO;
import com.travelmanagementsystem.service.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User registerUser(AdminUserDTO userDTO, String password);

    public boolean removeNonActivatedUser(User existingUser);

    public User createUser(AdminUserDTO userDTO);

    public Optional<AdminUserDTO> updateUser(AdminUserDTO userDTO);

    public void deleteUser(String login);

    public void updateUser(String firstName, String lastName, String email, String imageUrl);

    public void changePassword(String currentClearTextPassword, String newPassword);

    public Page<AdminUserDTO> getAllManagedUsers(Pageable pageable);

    public Page<UserDTO> getAllPublicUsers(Pageable pageable);

    public Optional<User> getUserWithAuthoritiesByLogin(String login);

    public Optional<User> getUserWithAuthorities();

    public List<String> getAuthorities();
}
