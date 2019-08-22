package com.bazooka.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfiguration {

    private static final String HOST = "ec2-50-19-254-63.compute-1.amazonaws.com";
    private static final String DB = "dahou9kpbb1qgl";
    private static final int PORT = 5432;
    private static final String USERNAME = "bbkfiwtxeukfkl";
    private static final String PASSWORD = "e4a0bb2daee9352f70599fbccb3e7a32508399c3b87881c788a3210de7d8d36d";


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
