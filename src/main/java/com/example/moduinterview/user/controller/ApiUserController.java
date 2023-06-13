package com.example.moduinterview.user.controller;


import com.example.moduinterview.user.repository.UserRepository;
import com.example.moduinterview.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiUserController {

  private final UserService userService;

  private final UserRepository userRepository;
}


