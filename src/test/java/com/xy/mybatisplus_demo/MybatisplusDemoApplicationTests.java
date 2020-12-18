package com.xy.mybatisplus_demo;

//import com.xy.mybatisplus_demo.mapper.UserMapper;
import com.xy.mybatisplus_demo.blog.mapper.UserMapper;
//import com.xy.mybatisplus_demo.pojo.User;
import com.xy.mybatisplus_demo.blog.entity.User;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisplusDemoApplicationTests {

    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
    @Test
    void contextLoads123() {
        List<User> userList = userMapper.testSelect(3);
        userList.forEach(System.out::println);
    }

    @Test
    void testInsert(){ //测试插入
        User user = new User();
        user.setAge(25);
        user.setName("bob");
        user.setEmail("2345@qq.com");
        //User的id为Long类型，不设置时默认为null,此时，mp会自动使用主键生成策略为其主键赋值，然后在执行insert操作。
        System.out.println(userMapper.insert(user));
        System.out.println("新插入记录的主键为："+user.getId()); //插入数据后，主键自动回填
    }

    @Test
    void testFill(){ //测试自定义属性填充策略
        User user = new User();
        user.setAge(22);
        user.setName("ysll");
        user.setEmail("2345@qq.com");
        System.out.println(userMapper.insert(user));
        System.out.println("自动填充的createTime："+user.getCreateTime()); //插入数据后，@TableField(fill = FieldFill.INSERT)自动填充属性
        System.out.println("自动填充的updateTime："+user.getCreateTime()); //插入数据后，@TableField(fill = FieldFill.INSERT_UPDATE)自动填充属性
    }

    @Test
    void testUpdate(){ //测试更新
        User user = new User();
        user.setId(1L);
        user.setName("NEWbob");
        user.setEmail("6666@qq.com");
        //更新时，updateById由于指定了主键所以只能更新一条记录
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

    @Test
    void testSelect(){ //测试简单查询
        //主键查询
        User user = userMapper.selectById(1);
        System.out.println(user);

        //条件查询
        Map<String,Object> map = new HashMap<>();
        map.put("name","NEWbob");
        map.put("age",18);
        List<User> users = userMapper.selectByMap(map);
        System.out.println(users);
    }

    @Test
    void testPageSelect(){  //分页查询
        Page<User> page = new Page<>(1,5);//参数表示当前页和页面大小

        //执行完下面的查询后，page对象会被填充
        userMapper.selectPage(page,null);

        System.out.println("记录总条数："+page.getTotal());
        System.out.println("查询结果："+page.getRecords());
    }
    @Test
    void testDelete(){  //删除
        System.out.println(userMapper.deleteById(1L));
    }


}
