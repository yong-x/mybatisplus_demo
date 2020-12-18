//package com.xy.mybatisplus_demo;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.xy.mybatisplus_demo.mapper.UserMapper;
//import com.xy.mybatisplus_demo.pojo.User;
//import org.junit.jupiter.api.Test;
//import org.omg.CORBA.INTERNAL;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class QueryWrapperTests { //测试条件构造器
//
//    @Autowired
//    UserMapper userMapper;
//
//    @Test
//    void contextLoads() {
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.eq("name","Sandy") //等于
//                .le("age",25) //小于
//                .ge("id",3) //大于
//                .isNotNull("email");//不为空
//        wrapper.orderByAsc("id");
//
//        List<User> users = userMapper.selectList(wrapper);
//
//        users.forEach(System.out::println);
//
//    }
//
//    @Test
//    void test1() {
//        QueryWrapper<User> wrapper = new QueryWrapper<>();//模糊匹配查询
//        wrapper.like("name","e") // %e%
//                .likeLeft("email","23") // %23
//                .likeRight("create_time","20") // 20%
//                .between("age",20,30);
//
//
//        int count = userMapper.selectCount(wrapper);
//
//        System.out.println(count);
//
//    }
//
//}
