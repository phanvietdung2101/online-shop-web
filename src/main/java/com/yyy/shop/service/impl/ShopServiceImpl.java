package com.yyy.shop.service.impl;

import com.yyy.shop.repository.ShopRepository;
import com.yyy.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopRepository shopRepository;
}
