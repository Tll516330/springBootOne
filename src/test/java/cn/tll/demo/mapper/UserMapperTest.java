package cn.tll.demo.mapper;

import cn.tll.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery(){
        User user = userMapper.selectByPrimaryKey(21L);
        System.out.println(user);
//        List<User> userList = userMapper.selectAll();
//        for (User user : userList) {
//            System.out.println(user);
//        }
    }
}