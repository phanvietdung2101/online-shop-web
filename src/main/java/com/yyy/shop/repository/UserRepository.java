package com.yyy.shop.repository;

import com.yyy.shop.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User,Long> {
    User getUserByUsername(String username);
}
