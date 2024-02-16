package com.bdqn.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.session.AutoMappingBehavior;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@MapperScan("com.bdqn.mapper")
public class MyBatisConfig {
    @Bean
    public SqlSessionFactory getFactory(DataSource ds) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(ds);
        factoryBean.setTypeAliasesPackage("com.bdqn.pojo");

        Configuration conf = new Configuration();
        conf.setAutoMappingBehavior(AutoMappingBehavior.FULL);
        conf.setMapUnderscoreToCamelCase(true);

        factoryBean.setPlugins(new PageInterceptor());
        factoryBean.setConfiguration(conf);
        return factoryBean.getObject();
    }
}
