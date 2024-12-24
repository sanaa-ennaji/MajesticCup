package org.sanaa.brif10.majesticcup.service.Impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.sanaa.brif10.majesticcup.Security.JWTService;
import org.sanaa.brif10.majesticcup.exception.UsernameAlreadyExistsException;
import org.sanaa.brif10.majesticcup.model.dto.Request.RegisterRequestDTO;
import org.sanaa.brif10.majesticcup.model.dto.Response.UserResponseDTO;
import org.sanaa.brif10.majesticcup.model.entity.MajeUser;
import org.sanaa.brif10.majesticcup.model.mapper.UserMapper;
import org.sanaa.brif10.majesticcup.model.dto.Request.LoginRequestDTO;
import org.sanaa.brif10.majesticcup.repository.RoleRepository;
import org.sanaa.brif10.majesticcup.repository.UserRepository;
import org.sanaa.brif10.majesticcup.service.Interface.UserServiceI;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import org.sanaa.brif10.majesticcup.model.entity.Role;


@Service
@Transactional
@RequiredArgsConstructor
public class UserService implements UserServiceI {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JWTService jwtService;

    @Override
    public UserResponseDTO register(RegisterRequestDTO dto) {
        if (userRepository.findByUsername(dto.username()).isPresent()) {
            throw new UsernameAlreadyExistsException("Username '" + dto.username() + "' already exists");
        }

        Role role = roleRepository.findByName("ROLE_OPERATOR").orElseThrow(() -> new EntityNotFoundException("Role '" + dto.username() + "' not found"));

        MajeUser user = userMapper.toEntity(dto);
        user.setRole(role);
        user.setPassword(passwordEncoder.encode(dto.password()));

        MajeUser savedUser = userRepository.save(user);
        return userMapper.toDto(savedUser);
    }

    public String verify(LoginRequestDTO user) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.username(), user.password()));
            if (authentication.isAuthenticated()) {
                return jwtService.generateToken(user.username(), user.password());
            }
        } catch (Exception e) {
            return "Authentication failed: " + e.getMessage();
        }
        return "Fails";
    }

}
