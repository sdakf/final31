package com.sda.final31.finalapp.users;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserListDto saveUser(UserRegistrationDto dto) {
        User user = User.fromDto(dto);
        User saved = userRepository.save(user);
        return saved.toListDto();
    }
}
