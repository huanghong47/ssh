package cn.hhfarcry.service.impl;

import cn.hhfarcry.dao.IUserDao;
import cn.hhfarcry.entity.UserEntity;
import cn.hhfarcry.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: springbootjpa
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-07 17:35
 */
@Service
public class Userservice implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    @Transactional
    public UserEntity add(UserEntity param) {
        UserEntity newUser = userDao.addUser(param);
        return newUser;
    }

    @Override
    @Transactional
    public List<UserEntity> getList() {
        return userDao.getlist();
    }
}
