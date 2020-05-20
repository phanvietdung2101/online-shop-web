package com.yyy.shop.service.impl;

import com.yyy.shop.repository.SubCategoryRepository;
import com.yyy.shop.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
    @Autowired
    SubCategoryRepository subCategoryRepository;
}
