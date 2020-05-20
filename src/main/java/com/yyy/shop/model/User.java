package com.yyy.shop.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    @ManyToMany(fetch = FetchType.EAGER )
    private List<Role> roleList;

    @Email
    private String email;


    private String address;

    @NotNull
    private String phone_number;




}
