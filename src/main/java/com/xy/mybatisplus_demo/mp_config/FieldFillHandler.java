package com.xy.mybatisplus_demo.mp_config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;


import java.util.Date;


/*
* 属性自动填充处理器，当在执行sql时，如果没有设置某个字段的值（为空）,mp自动填充策略
* */
@Slf4j
@Component
public class FieldFillHandler implements MetaObjectHandler {
    //插入操作时，属性的自动填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("填充create_time属性");
        //为create_time属性赋值为当前时间
        this.setFieldValByName("createTime", new Date(),metaObject);
        this.setFieldValByName("updateTime", new Date(),metaObject);
    }

    //更新操作时，属性的自动填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("填充update_time属性");
        //为create_time属性赋值为当前时间
        this.setFieldValByName("updateTime", new Date(),metaObject);
    }

}
