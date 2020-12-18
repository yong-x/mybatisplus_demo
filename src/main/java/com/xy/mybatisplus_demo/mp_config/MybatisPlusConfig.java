package com.xy.mybatisplus_demo.mp_config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@MapperScan("com.xy.mybatisplus_demo.mapper") //扫描要由框架生成代理实现类的Mapper接口所在包

@MapperScan("com.xy.mybatisplus_demo.blog.mapper")
@Configuration
public class MybatisPlusConfig {

    //分页插件配置
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
