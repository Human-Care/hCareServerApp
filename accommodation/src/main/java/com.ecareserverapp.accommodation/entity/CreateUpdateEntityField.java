package com.ecareserverapp.accommodation.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Calendar;

@MappedSuperclass
public abstract class CreateUpdateEntityField {
    @Column(updatable = false)
    @CreationTimestamp
    private Calendar createDate;

    @UpdateTimestamp
    private Calendar updateDate;
}