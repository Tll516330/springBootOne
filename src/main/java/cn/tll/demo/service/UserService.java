package cn.tll.demo.service;

import cn.tll.demo.entity.User;
import cn.tll.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tll
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id主键来查询
     * @param id
     * @return
     */
    public User findByid(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 添加用户 需要事务
     * @param user
     */
    @Transactional(rollbackFor = Exception.class)
    public void insertUser(User user){
        userMapper.insert(user);
    }
}
