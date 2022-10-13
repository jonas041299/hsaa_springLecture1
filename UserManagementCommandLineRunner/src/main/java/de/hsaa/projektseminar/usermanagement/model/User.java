package de.hsaa.projektseminar.usermanagement.model;

public class User {

    private String username;
    private String password;
    private String givenName;

    public User(String username, String password, String givenName) {
        this.username = username;
        this.password = password;
        this.givenName = givenName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGivenName() {
        return givenName;
    }
}
