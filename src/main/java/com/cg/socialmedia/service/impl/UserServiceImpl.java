package com.cg.socialmedia.service.impl;

import com.cg.socialmedia.dto.UserDTO;
//import com.cg.socialmedia.entity.User;
import com.cg.socialmedia.exception.UserNotFoundException;
import com.cg.socialmedia.mapper.EntityMapper;
import com.cg.socialmedia.repository.UserRepository;
import com.cg.socialmedia.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return repo.findAll()
                .stream()
                .map(EntityMapper::toUserDTO)
                .toList();
    }

//    @Override
//    public UserDTO getUserById(int id) {
//        return repo.findById(id)
//                .map(EntityMapper::toUserDTO)
//                .orElse(null);
//    }
    @Override
    public UserDTO getUserById(int id) {
        return repo.findById(id)
                .map(EntityMapper::toUserDTO)
                .orElseThrow(() ->
                    new UserNotFoundException("User not found with id: " + id)
                );
    }

    @Override
    public UserDTO getByUsername(String username) {
        return EntityMapper.toUserDTO(repo.findByUsername(username));
    }
}