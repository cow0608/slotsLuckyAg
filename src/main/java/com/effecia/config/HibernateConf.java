package com.effecia.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.effecia.webdata.entity.ApiConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackageClasses = ApiConfig.class,
        entityManagerFactoryRef = "partnerWebEntityManagerFactory",
        transactionManagerRef = "partnerWebTransactionManager"
)
public class HibernateConf {

    @Primary
    @Bean(name = "partnerWebEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean partnerWebEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        DataSource dataSource = partnerWebDataSource();
        return builder.dataSource(dataSource).packages(ApiConfig.class.getPackage().getName()).persistenceUnit("partnerWeb")
                .build();
    }

    @Primary
    @Bean(name = "partnerWebTransactionManager")
    public PlatformTransactionManager partnerWebTransactionManager(EntityManagerFactoryBuilder builder) {
        LocalContainerEntityManagerFactoryBean b = partnerWebEntityManagerFactory(builder);
        return new JpaTransactionManager(Objects.requireNonNull(b.getObject()));
    }

    @Primary
    @Bean(name = "partnerWebDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.partner-web")
    public DruidDataSource partnerWebDataSource() {
        return DruidDataSourceBuilder.create().build();
    }


    @Primary
    @Bean
    public JdbcTemplate partnerWebJdbcTemplate(){
        return new JdbcTemplate(partnerWebDataSource());
    }

}