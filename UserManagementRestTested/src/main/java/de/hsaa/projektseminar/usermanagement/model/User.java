package de.hsaa.projektseminar.usermanagement.model;

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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
