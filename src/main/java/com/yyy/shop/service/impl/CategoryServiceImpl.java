package com.yyy.shop.service.impl;

import com.yyy.shop.repository.CategoryRepository;
import com.yyy.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
}
