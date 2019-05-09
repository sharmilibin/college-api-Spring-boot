package com.admin.collegeapi.service;

import com.admin.collegeapi.db.entity.RoleEntity;
import com.admin.collegeapi.db.entity.UserEntity;
import com.admin.collegeapi.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        if (email.trim().isEmpty()) {
            throw new UsernameNotFoundException("username is empty");
        }
        UserEntity user = userRepository.findByEmail(email);

        if(user == null) {
            throw new UsernameNotFoundException("User with email " + email + " not found");
        }

        return new User(user.getUserName(), user.getPassword(), getGrantedAuthorities(user));
    }

    private List<GrantedAuthority> getGrantedAuthorities(UserEntity user) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        RoleEntity role = user.getRole();
        authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        return authorities;
    }
}