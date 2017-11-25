package com.ecareserverapp.accommodation.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Accommodation extends CreateUpdateEntityField {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    //For now we do not have entities which below, but in future this fields will show their ids
/*
    private Long author;
    private Long location;
*/

    public Accommodation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
