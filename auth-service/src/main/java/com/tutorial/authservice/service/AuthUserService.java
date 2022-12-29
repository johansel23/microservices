package com.tutorial.authservice.service;

import com.tutorial.authservice.dto.AuthUserDto;
import com.tutorial.authservice.dto.TokenDto;
import com.tutorial.authservice.entity.AuthUser;

public interface AuthUserService {
    public AuthUser save(AuthUserDto dto);

    public TokenDto login(AuthUserDto dto);

    public TokenDto validate(String token);
}
