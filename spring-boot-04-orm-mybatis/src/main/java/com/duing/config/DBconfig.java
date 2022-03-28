package com.duing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class DBconfig {
    @Bean
    @ConfigurationProperties("spring.datasource.db1")
    public DataSource db1(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.db2")
    public DataSource db2(){
        return DataSourceBuilder.create().build();
    }
}
