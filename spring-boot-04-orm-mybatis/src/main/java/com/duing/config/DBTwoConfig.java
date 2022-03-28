package com.duing.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.duing.mapper2",sqlSessionFactoryRef = "factory2")
public class DBTwoConfig {

    @Autowired
    @Qualifier("db2")
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory factory2() throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate template2() throws Exception{
        SqlSessionTemplate template = new SqlSessionTemplate(factory2());
        return template;
    }
}
