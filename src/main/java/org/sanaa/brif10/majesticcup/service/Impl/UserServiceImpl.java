package org.sanaa.brif10.majesticcup.service.Impl;

import org.sanaa.brif10.majesticcup.model.dto.Request.UserRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.UserResponseDTO;
import org.sanaa.brif10.majesticcup.model.mapper.UserMapper;
import org.sanaa.brif10.majesticcup.repository.UserRepository;
import org.sanaa.brif10.majesticcup.service.Interface.UserServiceI;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserServiceI {

    private final UserRepository userRepository;
    private final UserMapper userMapper;


    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponseDTO create(UserRequestDTO userRequestDTO) {
        User user = userMapper.toEntity(userRequestDTO);
        User savedUser = userRepository.save(user);
        return userMapper.toResponseDTO(savedUser);
    }

    @Override
    public UserResponseDTO update(String id, UserRequestDTO userRequestDTO) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
        userMapper.updateEntityFromRequest(userRequestDTO, user);
        User updatedUser = userRepository.save(user);
        return userMapper.toResponseDTO(updatedUser);
    }

    @Override
    public void delete(String id) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(user);
    }

    @Override
    public UserResponseDTO getById(String id) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
        return userMapper.toResponseDTO(user);
    }

    @Override
    public List<UserResponseDTO> getAll() {
        List<User> users = userRepository.findAll();
        return users.stream()
            .map(userMapper::toResponseDTO)
            .collect(Collectors.toList());
    }

//    @Override
//    public List<UserResponseDTO> getByRole(User.UserRole role) {
//        List<User> users = userRepository.findByRole(role);
//        return users.stream()
//            .map(userMapper::toResponseDTO)
//            .collect(Collectors.toList());
//    }
}
