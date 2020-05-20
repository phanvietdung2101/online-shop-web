package com.yyy.shop.repository;

import com.yyy.shop.model.Shop;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShopRepository extends PagingAndSortingRepository<Shop,Long> {
}
