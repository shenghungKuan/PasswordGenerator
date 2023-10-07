package com.passwordgenerator.user;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table
@Component
public class UserInfo {
    @Id
    @SequenceGenerator(name = " user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private int id;
    private String user;
    private String credential;
    private String website;
    private String username;
    private String password;

    public UserInfo() {
    }

    public UserInfo(int id, String user, String credential, String website, String username, String password) {
        this.id = id;
        this.user = user;
        this.credential = credential;
        this.website = website;
        this.username = username;
        this.password = password;
    }

    public UserInfo(int id, String user, String credential) {
        this.id = id;
        this.user = user;
        this.credential = credential;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
