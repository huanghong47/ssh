package cn.hhfarcry.dao;


import cn.hhfarcry.entity.UserEntity;

import java.util.List;

/**
 * @program: springbootjpa
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-07 17:33
 */
public interface IUserDao {
    public UserEntity addUser(UserEntity user);

    public List<UserEntity> getlist();

}
