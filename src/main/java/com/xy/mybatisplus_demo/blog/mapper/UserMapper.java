package com.xy.mybatisplus_demo.blog.mapper;

import com.xy.mybatisplus_demo.blog.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xuyong
 * @since 2020-12-18
 */
public interface UserMapper extends BaseMapper<User> {

    public List<User> testSelect(int id);
}
