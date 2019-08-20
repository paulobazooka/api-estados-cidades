package com.bazooka.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfiguration {

    private static final String HOST = "ec2-54-225-68-133.compute-1.amazonaws.com";
    private static final String DB = "d84fd1vlk2q43l";
    private static final int PORT = 5432;
    private static final String USERNAME = "wmrpovwighhlpk";
    private static final String PASSWORD = "6dce6cec6512f4b6ff2dc2be045c473abd38c99ccaf4f616343144b7b84825c9";


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
