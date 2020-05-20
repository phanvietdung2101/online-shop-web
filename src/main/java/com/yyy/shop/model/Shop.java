package com.yyy.shop.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;

@Entity
@Data
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    private String description;

    @OneToMany
    @NotEmpty
    private List<User> userList;

    @OneToMany
    @NotEmpty
    private List<Category> categoryList;

}
