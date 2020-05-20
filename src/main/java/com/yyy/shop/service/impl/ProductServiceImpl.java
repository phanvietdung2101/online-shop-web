package com.yyy.shop.service.impl;

import com.yyy.shop.repository.ProductRepository;
import com.yyy.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
}
