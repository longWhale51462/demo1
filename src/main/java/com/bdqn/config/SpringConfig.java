package com.bdqn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import({JDBCConfig.class, MyBatisConfig.class})
@ComponentScan("com.bdqn")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfig {
}
