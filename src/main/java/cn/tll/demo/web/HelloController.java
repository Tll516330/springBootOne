package cn.tll.demo.web;

import cn.tll.demo.entity.User;
import cn.tll.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  tll
 * @date 2020/04/21
 */
@RestController
@RequestMapping("user")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("{id}")
    public User index(@PathVariable("id")Long id){
        return userService.findByid(id);
    }
}
