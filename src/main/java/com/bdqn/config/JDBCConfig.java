package com.bdqn.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@PropertySource("classpath:jdbc.properties")
public class JDBCConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource getDS(){
        DruidDataSource ds = new DruidDataSource();
        ds.setPassword(password);
        ds.setUsername(username);
        ds.setUrl(url);
        ds.setDriverClassName(driver);
        return ds;
    }
}
