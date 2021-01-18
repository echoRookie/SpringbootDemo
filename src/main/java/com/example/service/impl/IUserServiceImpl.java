package com.example.service.impl;

import com.example.Dao.IUesrDao;
import com.example.entity.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    //将DAO注入Service层
    @Autowired
    private IUesrDao iUesrDao;

    @Override
    public User findUserById(int id) {
        return iUesrDao.findUserById(id);
    }
}
