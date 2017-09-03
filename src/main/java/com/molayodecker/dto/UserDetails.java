package com.molayodecker.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by molayodecker on 02/09/2017.
 */
@Entity
public class UserDetails {

    @Id
     public long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String userName;
}
