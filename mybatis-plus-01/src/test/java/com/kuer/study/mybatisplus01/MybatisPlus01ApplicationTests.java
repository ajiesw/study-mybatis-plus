package com.kuer.study.mybatisplus01;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kuer.study.mybatisplus01.mapper.UserMapper;
import com.kuer.study.mybatisplus01.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlus01ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectById(5);
        System.out.println(user);

        userMapper.insert(new User(){{
            setPassword("123456");
        }});
    }

    @Test
    public void testPage(){
        Page<User> page = new Page<>(1, 2);
        Page<User> userPage = userMapper.selectPage(page, null);
        System.out.println(page);
    }

    @Test
    public void testDelete(){
        userMapper.deleteById(5);
    }

}
