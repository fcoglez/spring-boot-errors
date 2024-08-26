package com.springboot.error.springboot_error.models.domain;

public class User {

    private Long id;
    private String name;
    private String surname;
    private Role role;

    public User() {
    }

    public User(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Role getRole() {
        return role;
    }

    public String getRoleName() {
        return role.getName();
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
