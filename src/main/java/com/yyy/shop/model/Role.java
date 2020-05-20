package com.yyy.shop.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.secure.spi.GrantedPermission;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Role implements GrantedAuthority {
    @Id
    private long id;

    @NotNull
    private String name;

    @Override
    public String getAuthority() {
        return this.name;
    }
}
