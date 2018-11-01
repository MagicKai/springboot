package com.zkx.springboot.dao;

import com.zkx.springboot.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findById(Long id);
}
