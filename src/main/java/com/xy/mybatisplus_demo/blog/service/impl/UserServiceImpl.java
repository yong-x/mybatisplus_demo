package com.xy.mybatisplus_demo.blog.service.impl;

import com.xy.mybatisplus_demo.blog.entity.User;
import com.xy.mybatisplus_demo.blog.mapper.UserMapper;
import com.xy.mybatisplus_demo.blog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuyong
 * @since 2020-12-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
