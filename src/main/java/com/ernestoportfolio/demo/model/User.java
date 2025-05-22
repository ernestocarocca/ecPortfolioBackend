package com.ernestoportfolio.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user") // Om tabellen i databasen heter "user"
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String city;
    private String country;
    private String phone;
    private String email;
    private String profileTitle;
    private String profileDescription;

    public User() {}

    public User(Long id, String firstName, String lastName, String city, String country,
                String phone, String email, String profileTitle, String profileDescription) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.email = email;
        this.profileTitle = profileTitle;
        this.profileDescription = profileDescription;
    }

    // Getters och Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getProfileTitle() { return profileTitle; }
    public void setProfileTitle(String profileTitle) { this.profileTitle = profileTitle; }

    public String getProfileDescription() { return profileDescription; }
    public void setProfileDescription(String profileDescription) { this.profileDescription = profileDescription; }
}
