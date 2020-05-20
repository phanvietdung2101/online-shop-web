package com.yyy.shop.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class SubCategory {
    @Id
    private long id;

    @NotNull
    private String name;

    @ManyToOne
    @NotNull
    private Category category;


}
