package de.hsaa.projektseminar.usermanagement.db.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TABLE")
public class User {

    @Id
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
