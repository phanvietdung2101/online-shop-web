package com.yyy.shop.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

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
    @Column(unique = true)
    @Length(min = 6,max = 30)
    private String username;

    @NotNull
    @Length(min = 6,max = 30)
    private String password;

    @NotNull
    @ManyToMany(fetch = FetchType.EAGER )
    private List<Role> roleList;

    @Email
    @Column(unique = true)
    private String email;


    private String address;

    @NotNull
    private String phone_number;


}
