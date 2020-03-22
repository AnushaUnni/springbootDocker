package com.dockerspring.auth.entity.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * This file contains the JpaConfig.java class.
 * This class consist of Jpa Configuration
 */
@Configuration
@EntityScan("com.dockerspring")
@EnableJpaRepositories(basePackages = "com.dockerspring")
public class JpaConfig {

    /**
     * dataSource-pool config
     *
     * @return ComboPooledDataSource
     */
    @Bean
    @ConfigurationProperties("hibernate.datasource")
    public ComboPooledDataSource dataSource() {
        return new ComboPooledDataSource();
    }
}
