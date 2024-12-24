package org.sanaa.brif10.majesticcup.Security;

import lombok.RequiredArgsConstructor;
import org.sanaa.brif10.majesticcup.model.entity.MajeUser;
import org.sanaa.brif10.majesticcup.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MajeUser user = repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User with username " + username + " not found"));

        Collection<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority(user.getRole().getName()));

        System.out.println("role : " + user.getRole().getName());
        return new org.springframework.security.core.userdetails.User(
            user.getUsername(),
            user.getPassword(),
            authorities);
    }
}
