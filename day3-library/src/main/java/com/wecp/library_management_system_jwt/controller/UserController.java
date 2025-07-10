package com.wecp.library_management_system_jwt.controller;


import com.wecp.library_management_system_jwt.dto.AuthRequest;
import com.wecp.library_management_system_jwt.dto.AuthResponse;
import com.wecp.library_management_system_jwt.entity.User;
import com.wecp.library_management_system_jwt.jwt.JwtUtil;
import com.wecp.library_management_system_jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


public class UserController {


}
