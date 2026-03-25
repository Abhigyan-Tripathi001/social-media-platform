package com.cg.socialmedia.service;

import com.cg.socialmedia.dto.UserDTO;
import java.util.List;

public interface IUserService {

    List<UserDTO> getAllUsers();

    UserDTO getUserById(int id);

    UserDTO getByUsername(String username);
}