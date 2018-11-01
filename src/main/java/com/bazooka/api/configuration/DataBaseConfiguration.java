package com.bazooka.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfiguration {

    private static final String HOST = "ec2-107-21-93-132.compute-1.amazonaws.com";
    private static final String DB = "dc6a9ljubsvssb";
    private static final int PORT = 5432;
    private static final String USERNAME = "xjqwijezdpjprk";
    private static final String PASSWORD = "69075cd6554387ab42b220daa263798504d6fa3eeb032fc619946000c0e4c372";


    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://" + HOST + ":" + PORT + "/" + DB);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }

}
