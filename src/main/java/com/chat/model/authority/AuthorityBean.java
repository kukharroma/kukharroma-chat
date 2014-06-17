package com.chat.model.authority;


import com.google.code.morphia.annotations.Id;
import org.bson.types.ObjectId;

import java.io.Serializable;

public class AuthorityBean implements Serializable{
    @Id
    private ObjectId id;

    private Authority authority;

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}