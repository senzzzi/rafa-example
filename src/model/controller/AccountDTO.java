package model.controller;

public class AccountDTO {

    private String name;
    private String email;
    private String profile;

    public AccountDTO(String name, String email, String profile) {
        this.name = name;
        this.email = email;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProfile() {
        return profile;
    }
}
