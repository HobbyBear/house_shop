package com.house.house.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author xch
 * @since 2019/6/6 17:12
 **/
@Configuration
public class DruidConfig {


    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();

        return druidDataSource;
    }


    @Bean
    public Filter statFilter(){
        StatFilter filter = new StatFilter();
        return filter;
    }
}
