package org.launchcode.thegamingnetwork.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;


import org.jetbrains.annotations.NotNull;
import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

public abstract class AbstractEntity {
    private int uid;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "uid", unique = true)
    public int getUid() {
        return  this.uid;

    }

    protected void setUid(int uid) {
    this.uid = uid;
    }
}
