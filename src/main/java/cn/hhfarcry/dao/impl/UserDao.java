package cn.hhfarcry.dao.impl;

import cn.hhfarcry.dao.IUserDao;
import cn.hhfarcry.entity.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.util.List;

/**
 * @program: ssh
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-09 13:37
 */
@Repository
public class UserDao extends HibernateDaoSupport implements IUserDao {

    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }

    @Override
    public UserEntity addUser(UserEntity user) {
        getHibernateTemplate().save(user);
        return user;
    }



    @Override
    public List<UserEntity> getlist() {
//        List<UserEntity> result = getHibernateTemplate().findByExample(new UserEntity());
//        return result;
        return getHibernateTemplate().execute(new HibernateCallback<List<UserEntity>>() {
            @Override
            public List<UserEntity> doInHibernate(Session session) throws HibernateException {
                String sql = "select * from t_user";
                List<UserEntity> result = session.createSQLQuery(sql).addEntity(UserEntity.class).list();
                return result;
            }
        });
    }
}
