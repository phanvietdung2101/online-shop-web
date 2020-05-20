package com.yyy.shop.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Min(1)
    private long price;

    private String description;

    @NotNull
    @ManyToOne
    private SubCategory subCategory;


}
