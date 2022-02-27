package com.sda.final31.finalapp.users;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "Users") //to jest w bazie danych
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String surname;
    private String zipCode;
    private String city;
    private String country;
    private String street;
    private String birthDate;
    private String pesel;
    private String email;
    private String password;
    private String phoneNumber;
    private boolean listEnabled;

    public UserListDto toListDto() {
        return new UserListDto(firstName, surname, city, pesel);
    }

    public static User fromDto(UserRegistrationDto dto) {
        User user = new User();
        user.birthDate = dto.getBirthDate();
        user.firstName = dto.getFirstName();
        user.surname = dto.getSurname();
        user.zipCode = dto.getZipCode();
        user.city = dto.getCity();
        user.country = dto.getCountry();
        user.street = dto.getStreet();
        user.birthDate = dto.getBirthDate();
        user.pesel = dto.getPesel();
        user.email = dto.getEmail();
        user.password = dto.getPassword();
        user.phoneNumber = dto.getPhoneNumber();
        user.listEnabled = dto.isListEnabled();
        return user;
    }
}

