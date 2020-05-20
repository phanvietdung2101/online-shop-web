package com.yyy.shop.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Category {
    @Id
    private long id;

    @NotNull
    private String name;
}
