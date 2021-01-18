package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

public interface IUserService {
    User findUserById(int id);
}
