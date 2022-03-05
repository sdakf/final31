package com.sda.final31.finalapp.users;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserListDto saveUser(UserRegistrationDto dto) {
        Map<String, String> errorMap = validate(dto);
        if (!errorMap.isEmpty()) {
            throw new UserValidationException(errorMap);
        }

        User user = User.fromDto(dto);
        User saved = userRepository.save(user);
        return saved.toListDto();
    }

    private Map<String, String> validate(UserRegistrationDto dto) {
        Map<String, String> errorMap = new HashMap<>();
        if (dto.getFirstName() == null || !dto.getFirstName().matches("^[A-Z][a-z]{2,}$")) {
            errorMap.put("firstNameError", "Wymagane przynajmniej 3 znaki(pierwsza litera duża, reszta małe).");
        }

        return errorMap;
    }
}
