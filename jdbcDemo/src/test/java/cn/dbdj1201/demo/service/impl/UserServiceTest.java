package cn.dbdj1201.demo.service.impl;

import cn.dbdj1201.demo.DemoApplication12010;
import cn.dbdj1201.demo.mapper.UserModelMapper;
import cn.dbdj1201.demo.service.IUserService;
import cn.hutool.db.nosql.redis.RedisDS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author yz1201
 * @date 2020-06-18 14:55
 **/
@SpringBootTest(classes = DemoApplication12010.class)
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void login() {
//        boolean login = userService.login("root", "root");
//        System.out.println(login);
        userService.findAll().forEach(System.out::println);
    }

    @Test
    public void test1() {
        Jedis jedis = RedisDS.create().getJedis();
//        Jedis jedis = new Jedis();
//        String set = jedis.set("124", "2323");

        Map<String, String> userInfo = jedis.hgetAll("userInfo");

        userInfo.forEach((key, value) -> System.out.println(key + "=" + value));
//        System.out.println(set);
    }


    @Test
    public void test2(){

    }
}