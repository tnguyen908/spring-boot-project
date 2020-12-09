package com.apps.developerblog.photoapp.api.users.service;

import com.apps.developerblog.photoapp.api.users.shared.UsersDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
    UsersDto createUser(UsersDto userDetails);
    UsersDto getUsersDetailsByEmail(String email);
}
