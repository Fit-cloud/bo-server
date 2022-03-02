package com.bo.main.core.config.datasource;

import com.bo.main.core.config.yaml.YamlPropertySourceFactory;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.LocalDateTimeTypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@MapperScan(
        value = {"com.bo.main"},
        annotationClass = MyDB.class,
        sqlSessionFactoryRef = "SqlSessionFactory"
)
@EnableTransactionManagement
@PropertySource(
        value = {"classpath:/db.yml"},
        ignoreResourceNotFound = true,
        factory = YamlPropertySourceFactory.class
)
public class DatabaseConfig {

    @Bean(name = "DataSource", destroyMethod = "close")
    @ConfigurationProperties(prefix = "db.my.hikari")
    public HikariDataSource mssqlDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name = "SqlSessionFactory")
    public SqlSessionFactory mssqlSqlSessionFactory(@Qualifier("DataSource") DataSource mssqlDataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(mssqlDataSource);
        factory.setTypeHandlers(new LocalDateTimeTypeHandler());
        factory.setMapperLocations(applicationContext.getResources("classpath*:/dao/my/**/*.xml"));
        return factory.getObject();
    }

    @Bean(name = "SqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
