package com.yyy.shop.service.impl;

import com.yyy.shop.model.Role;
import com.yyy.shop.repository.RoleRepository;
import com.yyy.shop.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }
}
